import java.util.*;
class Main { 
  public static int _1sCompliment(int n){
       return ~n;
  }
  public static int _1sComplimentMSP(int n){
    for(int i=0;(n>>i)!=0;i++){
      n^=1 << i;
    }
    return n;
  }
  public static int _2sCompliment(int n){
       return (~n)+1;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(_1sCompliment(n));  
     System.out.println(_1sComplimentMSP(n));
     System.out.println(_2sCompliment(n));
  }
}
