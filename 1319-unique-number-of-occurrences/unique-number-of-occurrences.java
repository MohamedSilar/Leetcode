class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map <Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num , freq.getOrDefault(num , 0) +1);
        }

        Set<Integer> occurance = new HashSet<>(freq.values());

        return freq.size() == occurance.size();
        
    }
}