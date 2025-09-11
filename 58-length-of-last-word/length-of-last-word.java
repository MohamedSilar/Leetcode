class Solution {
    public int lengthOfLastWord(String s) {
        int length= 0;

        int i=s.length()-1;

        while(i >=0 && s.charAt(i)== ' '){
            i--;
        }
        while(i >=0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;

        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i) == ' '){
        //         break;
        //     }else{
        //         length++;
        //     }
        // }
        //     return length;

        // s=s.trim();
        // int lastspace = s.lastIndexOf(' ');
        // return s.length() - lastspace - 1;
    }
}