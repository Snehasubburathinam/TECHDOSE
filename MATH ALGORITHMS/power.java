import java.util.*;
class Main {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int p=sc.nextInt();
    int res=1;
    while(p>0){
      if(p%2==1){
        res*=b;
      }
      b=b*b;
      p/=2;
    }
    System.out.println(res);
  }
}
