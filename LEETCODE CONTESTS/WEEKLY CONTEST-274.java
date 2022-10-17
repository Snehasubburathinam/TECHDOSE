class Solution {
    public boolean checkString(String s) {
        boolean f=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='b'){
                f=true;
            }
            if(f==true && c=='a'){
                return false;
            }
        }
        return true;
    }
}
