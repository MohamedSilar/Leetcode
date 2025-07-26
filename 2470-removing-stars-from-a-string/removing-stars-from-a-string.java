class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        for(int i =0 ;i<n;i++){
            if(s.charAt(i) == '*'){
                result.deleteCharAt(result.length() -1);
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}