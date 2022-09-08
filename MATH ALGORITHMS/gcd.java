import java.util.*;
class Main {
  static int GCD(int a,int b){
    return (a==0)?b:GCD(b%a,a);
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(GCD(a,b));
    //lcm
    int lcm=(a*b)/GCD(a,b);
  }
}
