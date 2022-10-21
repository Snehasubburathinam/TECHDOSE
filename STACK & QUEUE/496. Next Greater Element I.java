class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> s=new Stack<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int res[]=new int[nums1.length];
        int k=0;
        for(int val:nums2){
            while(!s.isEmpty() && s.peek()<val){
                map.put(s.pop(),val);
            }
            s.push(val);
        }
        for(int val:nums1){
            if(map.containsKey(val)==true){
                res[k++]=map.get(val);
            }else{
                res[k++]=-1;
            }
        }
        return res;
    }
}
