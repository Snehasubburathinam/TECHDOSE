class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int tg=0,tc=0;
       for(int i=0;i<gas.length;i++){
           tg+=gas[i];
           tc+=cost[i];
       }
           if(tg<tc) return -1;
           
       int r=0,s=0;
       for(int i=0;i<gas.length;i++){
         r=r+(gas[i]-cost[i]);
         if(r<0){
             r=0;
             s=i+1;
         }
       }
       return s;
    }
}
