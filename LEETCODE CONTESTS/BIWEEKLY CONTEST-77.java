class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        int n=s.length();
        int m=words.length;
        for(int i=0;i<n;i++){
            String str=s.substring(0,i+1);
            for(int j=0;j<m;j++){
              if(str.equals(words[j])){
                 c++;
              }
            }
        }
        return c;
    }
}
