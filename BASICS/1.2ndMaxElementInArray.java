import java.util.*;
class Main {
    static int SecondMax(int n, int arr[]){
    int max=arr[0]<arr[1]? arr[1]:arr[0];
    int secMax=arr[0]>arr[1]? arr[1]:arr[0];
    for(int i=2;i<n;i++){
      if(arr[i]>max){
        secMax=max;
        max=arr[i];
      }
    else if(arr[i]>secMax){
      secMax=arr[i];
    }
    }
    return secMax;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print(SecondMax(n,arr));
  }
}
