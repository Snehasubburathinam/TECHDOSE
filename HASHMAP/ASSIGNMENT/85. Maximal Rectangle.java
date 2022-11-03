class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return 0;
        }
        int r=matrix.length,c=matrix[0].length,max=0;
        int a[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(matrix[i][j]=='1'){
                   a[j]++;
               }else{
                   a[j]=0;
               }
            }
         for(int j=0;j<c;j++){
            int cc=a[j];
            while(cc>0){
                int cn=1;
                for(int k=j+1;k<a.length;k++){
                    if(cc<=a[k]){
                        cn++;
                    }else{
                        break;
                    }
                }
                max=Math.max(max,cc*cn);
                cc--;
            }
          }
        }
        return max;
    }
}
