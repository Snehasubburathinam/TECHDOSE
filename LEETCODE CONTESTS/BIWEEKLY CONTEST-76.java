class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])<min){
                min=Math.abs(nums[i]);
                c=nums[i];
            }
            else if(Math.abs(nums[i])==min){
                c=Math.max(nums[i],c);
            }
        }
        return c;
    }
}
