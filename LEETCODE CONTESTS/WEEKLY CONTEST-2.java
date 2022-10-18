class Solution {
    public char findTheDifference(String s, String t) {
       int []x=new int[26];
        for(char c:s.toCharArray()){
          x[c-'a']++;
        }
        for(char c:t.toCharArray()){
            if(--x[c-'a']<0){
                return c;
            }
        }
        return '\0';
    }
}
