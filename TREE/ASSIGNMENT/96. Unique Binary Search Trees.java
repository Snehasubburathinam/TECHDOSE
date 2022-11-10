class Solution {
    public int numTrees(int n) {
        int pt[]=new int[n+1];
        pt[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                pt[i]+=pt[j]*pt[i-j-1];
            }
        }
        return pt[n];
    }
}
