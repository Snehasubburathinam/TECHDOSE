class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int minLen=Integer.MAX_VALUE;
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            while(s>=target){
                minLen=Math.min(minLen,i-j+1);
                s-=nums[j];
                j++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            minLen=0;
        }
        return minLen;
    }
}
