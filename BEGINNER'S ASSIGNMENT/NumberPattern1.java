import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int number=1;
      for(int j=0;j<=i;j++){
        System.out.print(number+"");
        number++;
      }
      System.out.println();
    }
  }
}
