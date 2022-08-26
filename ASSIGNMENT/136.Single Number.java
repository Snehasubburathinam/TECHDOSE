//method 1
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int n:nums){
            x=x^n;
        }
        return x;
    }
}  
//method 2
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
           ans^=nums[i];
        }
        return ans;
    }
}
