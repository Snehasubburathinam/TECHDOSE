class Solution {
    static int gcd(int a,int b)
    {
       return (a==0)?b:gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        return gcd(min,max);
    }
}
