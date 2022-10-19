class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int c=0;
        int s[] = new int [26];
        int ss[] = new int [26];
        for (int i=0;i<s1.length();i++){
            
            if (s1.charAt(i) != s2.charAt(i)) c++;
            if (c>2) return false;
            s[s1.charAt(i)-'a']++;
            ss[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(s,ss);
    }
}
