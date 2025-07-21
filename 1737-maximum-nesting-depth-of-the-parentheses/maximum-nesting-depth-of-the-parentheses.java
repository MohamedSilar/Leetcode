class Solution {
    public int maxDepth(String s) {

        // StringBuilder result = new StringBuilder();
        int count = 0;
        int maxdept = 0;
       for(char c : s.toCharArray()){
            if(c =='('){
                count++;
                maxdept = Math.max(maxdept , count);
            }else if (c==')'){
                    count--;
            }

        }
        return maxdept;
        
        
    }
}