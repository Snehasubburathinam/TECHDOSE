class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
             res[i]=i;
         }
         int c[]=new int[n+1];
         c[0]=0;
         for(int i=1;i<=n;i++){
            while(res[i]>0){
                res[i]=res[i]&(res[i]-1);
                c[i]++;
            }     
        }
        return c;   
    }
}
