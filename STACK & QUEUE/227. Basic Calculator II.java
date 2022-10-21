class Solution {
    public int calculate(String str) {
        if(str==null) return 0;
        Stack<Integer>s=new Stack<Integer>();
        int n=0;
        char op='+';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                n=(n*10)+(c-'0');
            }
            if(!Character.isDigit(c) && !Character.isWhitespace(c)||i==str.length()-1){
                if(op=='+'){
                    s.push(n);
                }else if(op=='-'){
                    s.push((-1)*n);
                }else if(op=='*'){
                    s.push(s.pop()*n);
                }else if(op=='/'){
                    s.push(s.pop()/n);
                }
                op=c;
                n=0;
            }
        }
        int res=0;
        while(!s.empty()){
            res+=s.pop();
        }
        return res;
    }
}
