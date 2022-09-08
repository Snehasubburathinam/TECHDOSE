import java.util.*;
class Main {
  static void printAllPrime(int n){
    boolean[] isPrime=new boolean[n+1];
    for(int i=2;i<=n;i++){
      isPrime[i]=true;
    }
    for(int i=2;i*i<=n;i++){
      if(isPrime[i]){
        for(int j=2;j*i<=n;j++){
          isPrime[i*j]=false;
        }
      }
    }
    System.out.println();
    for(int i=1;i<=n;i++){
      if(isPrime[i]){
        System.out.print(i+",");
      }
    }
  }
  public static void main(String[] args){
        printAllPrime(100);
  }
}
