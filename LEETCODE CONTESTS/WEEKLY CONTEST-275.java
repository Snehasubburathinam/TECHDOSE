class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            Set<Integer>r=new HashSet<>();
            Set<Integer>c=new HashSet<>();
            for(int j=0;j<n;j++){
                r.add(matrix[i][j]);
                c.add(matrix[j][i]);
            }
           if(r.size()<n || c.size()<n){
               return false;
           }
        }
        return true;
    }
}
