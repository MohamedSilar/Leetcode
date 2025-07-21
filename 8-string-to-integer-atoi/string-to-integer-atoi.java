class Solution {
    public int myAtoi(String s) {

        int i =0;
        int n = s.length();
        int sign = 1;
        long result = 0;
       
       //Space Leading
        while(i < n && s.charAt(i)== ' '){
            i++;
        }

        //Sign Checking

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int num = s.charAt(i) - '0';
            result = result * 10 + num;
        

        if(sign==1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
         if(sign==-1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
         i++;
        }

     return (int) (sign * result);  
    }
}
