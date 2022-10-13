class Solution {
    public int rearrangeCharacters(String s, String target) {
        int f[]=new int[26];
        int f1[]=new int[26];
        for(char ch:s.toCharArray()){
            f[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            f1[ch-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(char ch:target.toCharArray()){
            min=Math.min(min,f[ch-'a']/f1[ch-'a']);
        }
        return min;
    }
}
