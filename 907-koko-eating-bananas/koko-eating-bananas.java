class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int left = 1  , right = getmax(piles);

        while(left < right){
            int mid = left + (right - left) / 2;
            if(caneatall(piles , h , mid)){
                   right = mid;
            }else{
                 left = mid + 1;
            }
        }
        return left;
    }
    private static int getmax(int[] piles){
        int max = 0;

        for(int pile : piles){
            if(pile > max){
                max = pile;
            }
        }
        return max;
    }

    private static boolean caneatall(int[] piles , int h , int mid){
            int hours = 0;
        for(int bananas : piles){
                hours+= (bananas + mid - 1) / mid;
            }

            return hours<=h;
    }
}