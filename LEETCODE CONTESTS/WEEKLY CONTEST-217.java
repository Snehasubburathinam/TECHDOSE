class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int s=0,max=0;
        for(int i=0;i<n;i++){
            s=0;
            for(int j=0;j<accounts[0].length;j++){
                s+=accounts[i][j];
            }
            max= Math.max(s,max);
        }
        return max;
    }
}
