class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int res=n+1;
        long[] sum=new long[n+1];
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+nums[i];
        }
        Deque<Integer> r=new ArrayDeque<>();
        for(int i=0;i<n+1;i++){
            while(r.size()>0 && sum[i]-sum[r.getFirst()]>=k){
                res=Math.min(res,i-r.pollFirst());
            }
            while(r.size()>0 && sum[i]<=sum[r.getLast()]){
                r.pollLast();
            }
            r.addLast(i);
        }
        return res<n+1?res:-1;
    }
}
