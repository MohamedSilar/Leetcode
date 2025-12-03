class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0) return result;

        String[] map = {
             "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        backstarck(digits , 0 , new StringBuilder() , result , map);
        return result;
    }

    private static void backstarck(String digits , int index , StringBuilder path , List<String> result , String[] map){
        if(index == digits.length()){
            result.add(path.toString());
            return;
        }

        char digit  = digits.charAt(index);
        String letters = map[digit - '0'];

        for(int i=0;i<letters.length();i++){
            path.append(letters.charAt(i));
            backstarck(digits, index + 1, path, result, map);
              path.deleteCharAt(path.length() - 1);
        }
    }
}