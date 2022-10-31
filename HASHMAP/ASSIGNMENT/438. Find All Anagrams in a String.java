class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> list=new ArrayList<Integer>();
        int a[]=new int[26];
        int b[]=new int[26];
        if(s.length()<p.length()){
            return list;
        }
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)){
            list.add(0);
        }
        int l=0,r=p.length();
        while(r<s.length()){
            b[s.charAt(l)-'a']--;
            b[s.charAt(r)-'a']++;
            if(Arrays.equals(a,b)){
                list.add(l+1);
            }
            l++;
            r++;
        }
        return list;
    }
}
