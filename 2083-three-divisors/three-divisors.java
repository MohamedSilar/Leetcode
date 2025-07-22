class Solution {
    public boolean isThree(int n) {

        int sqrt = (int)Math.sqrt(n);
        if (sqrt * sqrt != n) return false;

       return(isprime(sqrt));
    }
        private static boolean isprime(int n){
            if(n < 2) return false;
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n % i ==0) return false;
            }
            return true;
        }

}