class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result ="";
        int n = word1.length();
        int m = word2.length();
        int i =0 , j=0;
        while(i<n && j<m){
            result+=word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        while(i< n){
            result+=word1.charAt(i);
            i++;
        }
        while(j<m){
            result+=word2.charAt(j);
            j++;
        }
        return result;


        
    }
}