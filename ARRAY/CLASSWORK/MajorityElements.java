class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int val=nums[0];
        for(int n:nums){
            if(c==0){
                val=n;
            }
            c+=(n==val)?1:-1;
        }
        return val;
    }
}
