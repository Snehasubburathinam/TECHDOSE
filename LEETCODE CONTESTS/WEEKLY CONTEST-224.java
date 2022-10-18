class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int c=0;
        int max=0;
        for(int []res:rectangles){
            int val=Math.min(res[0],res[1]);
            if(max<val){
                max=val;
                c=1;
            }else if(max==val){
                c++;
            }
        }
        return c;
    }
}
