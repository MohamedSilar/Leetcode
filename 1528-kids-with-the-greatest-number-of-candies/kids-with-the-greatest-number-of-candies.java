class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int totalcount = 0 ;
        for(int candy : candies){
           if(candy > totalcount){
           totalcount = candy;
        }
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= totalcount);
        }
        return result;
    }
}