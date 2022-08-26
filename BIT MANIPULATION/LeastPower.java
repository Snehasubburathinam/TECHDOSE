import java.util.*;
class Main { 
  public static int LeastPower(int n){
    int count=0;
    while(n !=1){
      n>>=1;
      count++;
    }
    return 1<<count;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println(LeastPower(n));  
  }
}
