class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<s.length()-k+1;i++){
            String str=s.substring(i,i+k);
            int x=Integer.valueOf(str);
            if(x==0){
                continue;
            }if(num%x==0){
                c++;
            }
        }
        return c;
    }
}
