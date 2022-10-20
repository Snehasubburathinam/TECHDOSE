class Solution {
    public String firstPalindrome(String[] words) {
        int l=words.length;
        String s="";
        for(int i=0;i<l;i++){
            if(ispalindrome(words[i])){
                return words[i];
            }
        }
        return s;
    }
    private boolean ispalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
