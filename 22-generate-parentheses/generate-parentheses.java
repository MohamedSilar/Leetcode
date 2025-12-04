class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backstack(result ,  new StringBuilder() ,0 ,0 ,n);
        return result;
    }

        private static void backstack(List<String> result , StringBuilder path , int left , int right , int n){
            if(left == n && right ==n){
                result.add(path.toString());
                return;
            }

            if(left < n){
                path.append("(");
                 backstack(result ,  path ,left +1 ,right,n);
                 path.deleteCharAt(path.length()-1);

            }
            if(right < left){
                path.append(")");
                 backstack(result ,  path ,left,right + 1,n);
                 path.deleteCharAt(path.length()-1);


        }
        
    }
}