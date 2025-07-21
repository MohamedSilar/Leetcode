class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int[] count = new int[3];
        int right = 0 , left =0;
        int result = 0;

        for(right = 0 ; right < n ;right++){

            count[s.charAt(right) - 'a']++;


            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                result = result + n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

            return result;

    }
}