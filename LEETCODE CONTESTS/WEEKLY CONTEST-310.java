class Solution {
    public int mostFrequentEven(int[] nums) {  
        int n=nums.length;
        int res=-1;
        int max=0;
        int c[]=new int[100001];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                c[nums[i]]++;
            }
        }
         for(int i=0;i<100001;i++){
             if(c[i]>max){
                 max=c[i];
                 res=i;
             }
         }if(max==0){
             return -1;
         }         
        return res;
    }
}
