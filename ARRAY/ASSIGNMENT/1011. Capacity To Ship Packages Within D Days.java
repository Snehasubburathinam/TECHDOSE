class Solution {
    public int shipWithinDays(int[] weights, int d) {
        int left=0;
        int right=0;
        for(int i:weights){
            left=Math.max(left,i);
            right+=i;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int days=1;
            int curr=0;
            for(int i:weights){
                if(curr+i>mid){
                    curr=0;
                    days++;
                }
                curr+=i;
            }
            if(days>d)left=mid+1;
            else right=mid;
        }
        return left;
    }
}
