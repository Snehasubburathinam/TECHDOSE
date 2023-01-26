class Solution {
    public boolean isMatch(String s, String p) {
        var b=s.length();
        var a=p.length();
        var arr=new boolean[a+1][b+1];
        arr[a][b]=true;
        for(var i=a-1;i>=0;i--){
            if(p.charAt(i)=='*'){
             arr[i][b]=arr[i+1][b];
           }
        }
        for(var i=a-1;i>=0;i--){
            for(var j=b-1;j>=0;j--){
              if(p.charAt(i)=='?'|| p.charAt(i)==s.charAt(j)){
                  arr[i][j]=arr[i+1][j+1];
              }
              else if(p.charAt(i)=='*'){
                  arr[i][j]=arr[i+1][j] || arr[i][j+1];
              }
              }
            }
        return arr[0][0];
    }
}
