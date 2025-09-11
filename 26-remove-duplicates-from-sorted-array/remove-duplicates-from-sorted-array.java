class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int uniq = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != nums[uniq]){
                uniq++;
                nums[uniq] = nums[i];
            }
        }
        return uniq + 1;

    }
}