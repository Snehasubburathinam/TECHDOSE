class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int c=0,c1=0;
        for(int i=0;i<word1.length+word2.length;i++){
        if(i<word1.length()){
            s+=word1.charAt(c);
            c++;
        }
        if(i<word2.length()){
            s+=word2.charAt(c1);
            c1++;
        }
        }
        return s;
        
    }
}
