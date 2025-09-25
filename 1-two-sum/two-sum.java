public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement exists in the map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number with its index
            map.put(nums[i], i);
        }
        
        // If no solution found (though guaranteed by problem)
        throw new IllegalArgumentException("No two sum solution");
    }
}
