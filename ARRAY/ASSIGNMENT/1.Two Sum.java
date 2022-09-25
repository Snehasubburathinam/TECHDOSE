class Solution {
    public int[] twoSum(int[] r, int target) {
        int res[]=new int[2];
        for(int i=0;i<r.length;i++){
            for(int j=i+1;j<r.length;j++){
                if(r[i]+r[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}
