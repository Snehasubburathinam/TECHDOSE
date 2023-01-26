class Solution {
    public boolean exist(char[][] board, String word) {
        boolean [][]visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                   if(dfs(visited,board,word,i,j,0)){
                      return true;
                   }
                } 
            }
        }
       return false;
}
boolean dfs(boolean visited[][],char board[][],String word,int i,int j,int currLen){
    if(currLen==word.length()) return true;
    if(i<0 || j<0 || i>=board.length ||j>=board[0].length || word.charAt(currLen)!=board[i][j]||visited[i][j]==true) return false;
        visited[i][j]=true;
        boolean left=dfs(visited,board,word,i,j+1,currLen+1);
        boolean right=dfs(visited,board,word,i,j-1,currLen+1);
        boolean top=dfs(visited,board,word,i-1,j,currLen+1);
        boolean bottom=dfs(visited,board,word,i+1,j,currLen+1);
    visited[i][j]=false;
    if(left==true||right==true||top==true||bottom==true){
        return true;
    }else 
        return false;
    }
}
