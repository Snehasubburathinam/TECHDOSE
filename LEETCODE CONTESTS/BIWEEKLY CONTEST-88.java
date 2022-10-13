class Solution {
    public boolean equalFrequency(String word) {
        int f[]=new int[26];
        for(char c:word.toCharArray()){
            f[c-'a']++;
        }
        for(int i=0;i<26;i++){
            f[i]--;
        Set<Integer> set=new HashSet<>();
         for(int j=0;j<26;j++){
            if(f[j]==0){
              continue;
            }
            set.add(f[j]);
         }
         if(set.size()==1){
              return true;
         }
         f[i]++;
        }
        return false;
    }
}
