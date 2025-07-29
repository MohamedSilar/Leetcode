class Solution {
    public int largestAltitude(int[] gain) {
        int currentaltitude = 0;
        int maxaltitude = 0;
        for(int num : gain){
            currentaltitude += num;
            maxaltitude = Math.max(maxaltitude,currentaltitude);
        }
    return maxaltitude;
    }
}