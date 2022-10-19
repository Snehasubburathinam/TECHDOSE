class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int hv=0;
        int left=nums[0];
        for(int i=1;i<n-1;i++){
            if((left<nums[i] && nums[i]>nums[i+1]) || (left>nums[i] && nums[i]<nums[i+1])){
                hv++;
                left=nums[i];
            }
        }
        return hv;
    }
}
