class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        int y=0;
        for(int n:nums){
            x=x^n & ~y;
            y=y^n & ~x;
        }
        return x;
    }
}  

