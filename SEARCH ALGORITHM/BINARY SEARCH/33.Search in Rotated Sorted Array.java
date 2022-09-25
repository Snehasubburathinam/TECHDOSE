class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int m=0;
        while(l<=r){
            m=(r+l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>=nums[l]){
               if(target<=nums[m] && target>=nums[l]){
                  r=m-1;
                }else{
                   l=m+1;
               }
            }
            else{
                if(target>=nums[m] && target<=nums[r]){
                    l=m+1;
                }else{
                    r=m-1;
                }
            }
        }
        return -1;
    }
}
//TIME COMPLEXITY
//BC:O(1)
//WQC:O(logN)
