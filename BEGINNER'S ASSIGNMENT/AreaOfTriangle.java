import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    float s=(a+b+c)/2;
    System.out.print(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
  }
}
