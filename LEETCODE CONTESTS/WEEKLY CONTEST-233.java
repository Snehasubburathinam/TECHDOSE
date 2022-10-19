class Solution {
    public int maxAscendingSum(int[] nums) {
      int n=nums.length;
        int t=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                t+=nums[i];
            }else{
                t=nums[i];
            }
            max=Math.max(max,t);
        }
        return max;
    }
}
