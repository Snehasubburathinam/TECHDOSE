class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int l=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=c+(nums[i]==1?1:-1);
            if(mp.containsKey(c)){
                l=Math.max(l,i-mp.get(c));
            }else{
                mp.put(c,i);
            }
        }
        return l;
    }
}
