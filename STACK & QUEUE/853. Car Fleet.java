class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n=position.length;
       int res=0;
        double []arr=new double[target];
        for(int i=0;i<n;i++){
            arr[position[i]]=(double)(target-position[i])/speed[i];
        }
            double prev=0.0;
            for(int i=target-1;i>=0;i--){
                double curr=arr[i];
                if(curr>prev){
                    prev=curr;
                    res++;
                }
            }
        
        return res;
        
    }
}
