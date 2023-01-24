class Solution {
    public int jump(int[] nums) {
        int max=0;
        int c=0;
        int current=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]+i);
            if(i==current){
                c+=1;
                current=max;
            }
        }
        return c;
    }
}
