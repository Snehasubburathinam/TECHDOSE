class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i+=2){
            if(nums[i-1]!=nums[i]){
                return false;
            }
        }
        return true;
    }
}
