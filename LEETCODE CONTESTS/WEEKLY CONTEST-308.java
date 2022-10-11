class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        int res[]=new int[m];
        for(int i=0;i<m;i++){
            int q=queries[i];
            res[i]=maxSubSeq(q,nums);
        }
        return res;
    }
        public int maxSubSeq(int q,int []nums){
        int c=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            if(s>q){
                return c;
            }
            c++;
        }
        return c;
    }
}
