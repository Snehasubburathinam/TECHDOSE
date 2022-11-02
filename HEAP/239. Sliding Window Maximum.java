class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        int a[]=new int[nums.length-k+1];
        int x=0;
        for(int i=0;i<nums.length;i++){
            while(!pq.isEmpty() && pq.peek()<=i-k){
                pq.remove();
            }
            pq.add(i);
            if(i>=k-1){
                a[x++]=nums[pq.peek()];
            }
        }
        return a;
    }
}
