class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>res=new ArrayList<>();
        List<String>curr=new ArrayList<>();
        generateSentence(res,curr,s,wordDict,0);
        return res;
    }
    public void generateSentence(List<String>res,List<String>curr,String s,List<String>wordDict,int k){
        for(int i=k;i<=s.length();i++){
            String str=s.substring(k,i);
                if(wordDict.contains(str)){
                    curr.add(str);
                    if(i==s.length()){
                        String ch[]=curr.toArray(String[]::new);
                        res.add(String.join(" ",ch));
                    }else{
                        generateSentence(res,curr,s,wordDict,i);
                    }
                    curr.remove(curr.size()-1);
                }
           }
      }
}
