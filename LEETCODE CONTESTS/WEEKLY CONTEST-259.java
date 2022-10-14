class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].charAt(0)=='+' || operations[i].charAt(1)=='+'){
                x+=1;
            }else{
                x-=1;
            }
        }
        return x;
    }
}
