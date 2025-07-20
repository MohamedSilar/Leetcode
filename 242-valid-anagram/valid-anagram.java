class Solution {
    public boolean isAnagram(String s, String t) {
        // Brute Force 
        // if(s.length() != t.length()) return false;
        /*char[] sarray = s.toCharArray();
         char[] tarray = t.toCharArray();
         Arrays.sort(sarray);
           Arrays.sort(tarray);
           return Arrays.equals(sarray,tarray);
*/
           // optimal Solution 
            // if(s.length() != t.length()) return false;
            // char[] chararray = new char[26];
            // for(int i = 0 ;i<s.length();i++){
            //     chararray[s.charAt(i) - 'a'] ++;
            //     chararray[t.charAt(i) - 'a'] --;
            // }

            // for(int count : chararray){
            //     if(count != 0) return false;
            // }
            // return true;

            if (s.length() != t.length()) return false;


            Map<Character, Integer> maps = new HashMap<>();

            for(int i=0;i<s.length();i++){
                maps.put(s.charAt(i) ,maps.getOrDefault(s.charAt(i),0) +1);
            }

            for(int i = 0 ;i<t.length();i++){
                if(maps.containsKey(t.charAt(i)) && maps.get(t.charAt(i))>0){
                    maps.put(t.charAt(i) , maps.get(t.charAt(i))-1);
                   
                }else{
                     return false;
                }
            }

            return true;
    }
}