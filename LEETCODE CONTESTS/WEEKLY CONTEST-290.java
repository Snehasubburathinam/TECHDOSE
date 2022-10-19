class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        int c[]=new int[1001];
        for(int []arr:nums){
            for(int i:arr){
                c[i]++;
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==nums.length){
                res.add(i);
            }
        }
        return res;
    }
}
