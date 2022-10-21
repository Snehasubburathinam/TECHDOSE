class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!s.isEmpty() && h<heights[s.peek()]){
                int top=s.pop();
                int width=s.isEmpty()? i:i-s.peek()-1;
                int area=width*heights[top];
                max=Math.max(max,area);
            }
            s.push(i);
        }
        return max;
    }
}
