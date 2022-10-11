class Solution {
   static int count(int mid,int m,int n){
        int c=0;
        for(int i=1;i<=m;i++){
            c+=Math.min(mid/i,n);
        }
        return c;
    }
    public int findKthNumber(int m, int n, int k) {
        int left=1;
        int right=m*n;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(count(mid,m,n)<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
      return left;
    }
}
