import java.util.*;
class Main {
  public static int[] CountSort(int arr[],int n,int k){
    int freq[]=new int[10];
    for(int i=0;i<n;i++){
      freq[(arr[i]/(int)Math.pow(10,k))%10]++;
    }
    for(int i=1;i<10;i++){
      freq[i]+=freq[i-1];
    }
    int res[]=new int[n];
    for(int i=n-1;i>=0;i--){
      int x=--freq[(arr[i]/(int)Math.pow(10,k))%10];
      res[x]=arr[i];
    }
    return res;
  }
  public static int[] RadixSort(int arr[],int n){
    int digits=2;
    for(int i=1;i<=digits;i++){
        arr=CountSort(arr,n,i-1);
    }
    return arr;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int []res=RadixSort(arr,n);
    for(int i=0;i<n;i++){
      System.out.print(res[i]+" ");
    }
  }
} 
//Time Complexity :O((N+R)*digits)~O(N)
