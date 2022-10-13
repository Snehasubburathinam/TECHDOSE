class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        HashSet<Integer> res=new HashSet<Integer>();
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int x:nums1){
            set1.add(x);
        }
        for(int x:nums2){
            if(set1.contains(x)){
                res.add(x);
            }
            set2.add(x);
        }
        for(int x:nums3){
            if(set1.contains(x)|| set2.contains(x)){
                res.add(x);
            }
        }
        return new ArrayList<Integer>(res);
    }
}
