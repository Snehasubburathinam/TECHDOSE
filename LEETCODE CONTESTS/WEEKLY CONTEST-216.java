class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        for(int i=0;i<word1.length;i++){
            s+=word1[i];
        }
        String r="";
        for(int i=0;i<word2.length;i++){
            r+=word2[i];
        }
        return s.equals(r);
    }
}
