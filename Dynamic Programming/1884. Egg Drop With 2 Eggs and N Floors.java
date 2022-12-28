class Solution {
    public int twoEggDrop(int n) {
        int m=0;
        while(m*(m+1)/2<n){
          m++;
        }
        return m;
    }
}
