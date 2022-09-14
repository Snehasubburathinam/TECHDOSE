class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb=new StringBuilder();
        sb.append(x);
        String n=sb.toString();
        if(sb.reverse().toString().equals(n)){
            return true;
        }else{
            return false;
        }
    }
}
