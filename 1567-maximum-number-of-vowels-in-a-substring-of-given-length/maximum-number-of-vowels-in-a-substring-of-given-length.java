class Solution {
    public int maxVowels(String s, int k) {

       int maxvowels = 0 , count = 0;

       for(int i =0;i<s.length();i++){
        if(isvowels(s.charAt(i))) count++;

        if(i >= k && isvowels(s.charAt(i-k))) count--;

        maxvowels = Math.max(maxvowels , count);
       }


       return maxvowels;
    }

       private static boolean isvowels(char c){
        return "aeiou".indexOf(c) != -1;
       
    }
}