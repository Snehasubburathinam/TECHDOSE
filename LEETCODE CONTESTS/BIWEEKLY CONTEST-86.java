class Solution {
    public boolean findSubarrays(int[] num) {
        int n=num.length;
        int s[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            s[i]=num[i]+num[i+1];
        }
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
