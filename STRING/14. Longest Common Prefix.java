class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0) return "";
        String r=strs[0];
        for(String s:strs){
            int i=0;
            while(i<Math.min(r.length(),s.length()) && r.charAt(i)==s.charAt(i)){
            i++;
           }
           r=s.substring(0,i);
        }
        return r;
    }
}
