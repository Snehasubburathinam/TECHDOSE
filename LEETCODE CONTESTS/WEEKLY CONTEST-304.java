class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int c=0;
        int res[]=new int[101];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
              res[nums[i]]++;
            }
        }
        for(int i=0;i<101;i++){
            if(res[i]!=0){
              c++;
            }
        }
     return c;
  }
}
