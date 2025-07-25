class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length<0) return nums.length;

        int count = 0;

        int candidates = nums[0];

        for(int num : nums){
            if(count == 0){
                candidates = num;
            }
            count += (num == candidates) ? 1 : -1;

        }
        return candidates;


    }
}