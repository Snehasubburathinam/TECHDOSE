class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char []s=strs[i].toCharArray();
            Arrays.sort(s);
            String s1=new String(s);
            if(mp.containsKey(s1)){
                mp.get(s1).add(strs[i]);
            }else{
                List<String>list=new ArrayList();
                list.add(strs[i]);
                mp.put(s1,list);
            }
        }
        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
