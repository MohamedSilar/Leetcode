class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxsum= nums[0];
        int minsum=nums[0];
        int product =nums[0];
        for(int i=1;i<n;i++){
            int temp = maxsum; 

             maxsum = Math.max(nums[i] , Math.max(maxsum * nums[i] ,  minsum * nums[i]));
             minsum = Math.min(nums[i] , Math.min(temp * nums[i] ,  minsum * nums[i]));
             product = Math.max(product , maxsum);

        }
        return product;

        
    }
}