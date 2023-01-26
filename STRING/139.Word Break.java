class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean []a=new boolean[n+1];
        a[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(a[j] && wordDict.contains(s.substring(j,i))){
                    a[i]=true;
                }
            }
        }
        return a[n];
    }
}
