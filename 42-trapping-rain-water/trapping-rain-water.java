class Solution {
    public int trap(int[] height) {

        int n = height.length;

        if(n==0) return 0;

        int[] maxleft = new int[n];
        int[] maxright = new int[n];

        //left
        maxleft[0] = height[0];
        for(int i = 1;i<n;i++){
            maxleft[i]=Math.max(maxleft[i-1],height[i]);
        }
        //right
        maxright[n-1] = height[n-1];
        for(int i = n -2 ;i>0;i--){
            maxright[i]=Math.max(maxright[i+1],height[i]);
        }
        //total water
        int totalwater=0;
        for(int i =0;i<n;i++){
            totalwater +=Math.max(0,Math.min(maxleft[i] , maxright[i]) - height[i]);
        }
        return totalwater;
    }
}