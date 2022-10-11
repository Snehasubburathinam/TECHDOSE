class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int left = 0;
        int right = matrix[0].length; 
        int top = 0;
        int bottom = matrix.length;        
        while(left<right && top<bottom)
        {
            for(int i=left;i<right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<bottom;i++)
            {
                ans.add(matrix[i][right-1]);
            }
            right--;
            
            if(top<bottom) 
            {
                for(int i=right-1;i>=left;i--)
                {
                    ans.add(matrix[bottom-1][i]);
                }
                bottom--;
            }
            if(left<right)
            {
                for(int i=bottom-1;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
