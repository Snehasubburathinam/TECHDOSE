class Solution {
    public int minOperations(String s) {
        int c=0;
        int c1=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!='0'){
                    c++;
                }else{
                    c1++;
                }
            }else{
                if(s.charAt(i)!='1'){
                    c++;
                }else{
                    c1++;
                }
            }
        }
        return Math.min(c,c1);
    }
}
