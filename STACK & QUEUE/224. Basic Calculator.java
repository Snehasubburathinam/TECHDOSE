class Solution {
    public int calculate(String str) {
        if(str==null) return 0;
        
        Stack<Integer> s=new Stack<Integer>();
        s.push(0);
        int sign=1;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                int n=str.charAt(i)-'0';
                while(i+1<str.length() && Character.isDigit(str.charAt(i+1))){
                    n=(n*10)+str.charAt(i+1)-'0';
                    i++;
                }
                s.push(s.pop()+(sign*n));
            }
            else if(str.charAt(i)=='+'){
                sign=1;
            }
            else if(str.charAt(i)=='-'){
                sign=-1;
            }else if(str.charAt(i)=='('){
                s.push(sign);
                s.push(0);
                sign=1;
            }
            else if(str.charAt(i)==')'){
                s.push(s.pop()*s.pop()+s.pop());
            }
        }
        return s.pop();
    }
}
