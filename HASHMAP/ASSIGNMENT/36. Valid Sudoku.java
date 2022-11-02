class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    String r='r'+"-"+i+"-"+board[i][j];
                    String c='c'+"-"+j+"-"+board[i][j];
                    String rc = (i / 3) + "-" + board[i][j] + "-" + (j / 3);
                    if (!hs.add(r) || !hs.add(c) || !hs.add(rc)) 
                        return false;
                }
            }
        }
        return true;
    }
}
//
class Solution {
    public boolean isValidSudoku(char[][] board) {
      Map<Integer,Integer>[]r=new HashMap[9];
      Map<Integer,Integer>[]c=new HashMap[9];
      Map<Integer,Integer>[]b=new HashMap[9];
        for(int i=0;i<9;i++){
            r[i]=new HashMap<Integer,Integer>();
            c[i]=new HashMap<Integer,Integer>();
            b[i]=new HashMap<Integer,Integer>();
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    int n=board[i][j];
                    int bx=(i/3)*3+(j/3);
                    r[i].put(n,r[i].getOrDefault(n,0)+1);
                    c[j].put(n,c[j].getOrDefault(n,0)+1);
                    b[bx].put(n,b[bx].getOrDefault(n,0)+1);
                    if(r[i].get(n)>1 || c[j].get(n)>1 || b[bx].get(n)>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
