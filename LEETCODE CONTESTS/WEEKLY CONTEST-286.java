class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       HashSet<Integer>s1=new HashSet<>();
       HashSet<Integer>s2=new HashSet<>();
        for(int n1:nums1){
            s1.add(n1);
        }
        for(int n2:nums2){
            s2.add(n2);
        }
        HashSet<Integer>cpy=new HashSet<>(s1);
        s1.removeAll(s2);
        s2.removeAll(cpy);
        return Arrays.asList(new ArrayList<>(s1), new ArrayList<>(s2));

    }
}
