import java.util.*;
class Main { 
  public static int RightMostOne(int n){
       return n&(~n+1);
  }
  public static int RightMostOnePosition(int n){
    int p=0;
    while((n&1)==0){
      n>>=1;
      p++;
    }
   return p+1;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(RightMostOne(n));  
     System.out.println(RightMostOnePosition(n));
  }
}
