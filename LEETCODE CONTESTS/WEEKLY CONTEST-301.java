class Solution {
    public int fillCups(int[] amount) {
        int c=0;
        Arrays.sort(amount);
        while(amount[1]>0 && amount[2]>0){
            amount[1]--;
            amount[2]--;
            Arrays.sort(amount);
            c++;
        }
         while(amount[2]>0){
            amount[2]--;
            c++;
        }
       return c ;
    }
}
//
class Solution {
    public int fillCups(int[] amount) {
       int max = Math.max(Math.max(amount[0],amount[1]),amount[2]);
        int sum = amount[0] + amount[1] + amount[2];
        return Math.max(max , (sum+1)/2);
    }
}
//
