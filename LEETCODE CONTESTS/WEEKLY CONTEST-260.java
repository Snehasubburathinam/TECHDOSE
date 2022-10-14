class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int res=0;
        for(int i=0;i<n;i++){
         min=Math.min(min,nums[i]);
            res=Math.max(res,nums[i]-min);
        }
        return res>0?res:-1;
    }
}
