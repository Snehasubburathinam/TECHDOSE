import java.util.*;
class Main {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(n==i*i){
        System.out.println("Perfect Square");
        return;
      }
    }
    System.out.println("Not Perfect Square");
    return;
  }
}
