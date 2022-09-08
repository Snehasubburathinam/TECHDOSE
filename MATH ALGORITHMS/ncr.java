import java.util.*;
class Main {
  static int NCR(int n,int r){
    int pt[][]=new int[n+1][n+1];
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        if(j==0 || i==j){
          pt[i][j]=1;
        }else{
          pt[i][j]=pt[i-1][j-1]+pt[i-1][j];
        }
      }
    }
    return pt[n][r];
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    System.out.println(NCR(n,r));
  }
}
