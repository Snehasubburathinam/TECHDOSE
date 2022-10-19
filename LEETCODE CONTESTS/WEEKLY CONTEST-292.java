class Solution {
    public String largestGoodInteger(String s) {
        String res="";
        for(int i=1;i!=s.length()-1;i++){
            if(s.charAt(i-1)==s.charAt(i) && s.charAt(i)==s.charAt(i+1)){
                if(res.length()==0){
                    res=s.substring(i-1,i+2);
                }else if(s.charAt(i)>res.charAt(0)){
                    res=s.substring(i-1,i+2);
                }
            }
        }
        return res;
    }
}
