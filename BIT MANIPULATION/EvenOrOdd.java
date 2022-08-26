import java.util.*;
class Main { 
  public static boolean EvenOrOdd(int n){
    return (n&1)==0;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      if(EvenOrOdd(n)==true){
         System.out.println("Even");
      }else{
         System.out.println("Odd");
      }
  }
}
