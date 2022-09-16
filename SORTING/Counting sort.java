import java.util.*;
class Main{
  public static int[] CountSort(int arr[],int n){
    int freq[]=new int[10];
    for(int i=0;i<n;i++){
      freq[arr[i]]++;
    }
    for(int i=1;i<10;i++){
      freq[i]+=freq[i-1];
    }
    int res[]=new int[n];
    for(int i=n-1;i>=0;i--){
      int x=--freq[arr[i]];
      res[x]=arr[i];
    }
    return res;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int []res=CountSort(arr,n);
    for(int i=0;i<n;i++){
      System.out.print(res[i]+" ");
    }
  }
}
//Time Complexity:O(N)
