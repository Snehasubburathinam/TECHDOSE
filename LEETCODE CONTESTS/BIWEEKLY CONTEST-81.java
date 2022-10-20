class Solution {
    public int countAsterisks(String s) {
        boolean flag=true;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='*' && flag){
                c++;
            }
            if(ch=='|'){
                flag=!flag;
            }
        }
        return c;
    }
}
