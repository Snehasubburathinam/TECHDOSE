class Solution {
    public boolean checkDistances(String s, int[] distance) {
       int n=s.length();
        for(int i=0;i<n;i++){
            char curr_char=s.charAt(i);
            int first_index=s.indexOf(curr_char);
            int last_index=s.lastIndexOf(curr_char);
            int dist=last_index-first_index-1;
            if(distance[curr_char-97]!=dist){
                return false;
            }
        }
        return true;
    }
}
