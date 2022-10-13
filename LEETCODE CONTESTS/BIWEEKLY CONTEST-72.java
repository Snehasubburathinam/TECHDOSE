class Solution {
    public int countPairs(int[] nums, int k) {
       int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
          if(0 <= i && i < j && j < n) {
            if(nums[i]==nums[j]){
                if((i*j)%k==0){
                c++;
                }
              }
             }
           }
        }
        return c;
    }
}
