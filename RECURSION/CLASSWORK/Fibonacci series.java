import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(Fibonacci(n));
  }
  //memoization
  public static int Fibonacci(int n){
    int []fib=new int[n+1];
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<=n;i++){
      fib[i]=fib[i-1]+fib[i-2];
    }
    return fib[n];
  }
  //recursion
  public static int Fibonacci(int n){
    if(n==0||n==1){
      return n;
    }
    return Fibonacci(n-1)+Fibonacci(n-2);
  }
}
