class Solution {
    public int[] numberOfPairs(int[] nums) {
       int []arr=new int[101];
        for(int n:nums){
            arr[n]++;
        }
        int res[]=new int[2];
        for(int x:arr){
            res[0]+=x/2;
            res[1]+=x%2;
        }
        return res;
    }
}
