class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        // String word = s + s;

        // return word.contains(goal);


        int n = s.length();

        for(int i =0 ;i<n;i++){
            boolean match = true;

            for(int j = 0 ; j<n;j++){
                if(s.charAt((i + j) % n) != goal.charAt(j)){
                    match = false;
                    break;
                }
            }

            if(match) return true;

        }

        return false;

        

    }
}