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
//
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null || strs.length==0){
           return new ArrayList<>();
       }
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char []ss=s.toCharArray();
            Arrays.sort(ss);
            String s1=String.valueOf(ss);
            if(!mp.containsKey(s1)){
                mp.put(s1,new ArrayList<>());
            }
             mp.get(s1).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
