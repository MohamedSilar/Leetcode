class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length < 0) return 0;

        int n = nums.length;

        int unique = 0 ;

        for(int i=1;i<n;i++){
            if(nums[i] != nums[unique]){
                unique++;
                nums[unique] = nums[i];
            }
        }

        return unique + 1;

    }
}