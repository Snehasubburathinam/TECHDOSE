class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(Math.abs(i-start)<n){
                     n=Math.abs(i-start);
                } 
            }
        }
        return n;
    }
}
