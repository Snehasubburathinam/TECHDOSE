class Solution {
    public int minimumCost(int[] cost) {
        int s=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i-=3){
            s+=cost[i];
            if(i-1>=0){
                s+=cost[i-1];
            }
        }
        return s;
    }
}
