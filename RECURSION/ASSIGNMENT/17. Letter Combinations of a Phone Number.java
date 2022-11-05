class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        combination(digits,0,digits.length(),"",res);
        return res;
    }
    public static void combination(String digits,int start,int n,String s,List<String>res){
        if(start==n){
            res.add(s);
            return ;
        }
        String []str=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int j=0;j<str[digits.charAt(start)-'0'].length();j++){
            combination(digits,start+1,n,s+""+str[digits.charAt(start)-'0'].charAt(j),res);
        }
    }
}
