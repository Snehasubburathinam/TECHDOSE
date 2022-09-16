import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    if(arr[0]>arr[1]){
      int temp=arr[0];
          arr[0]=arr[1];
          arr[1]=temp;
    }
    for(int i=2;i<n;i++){
      int j=i;
        while((j>=1) && (arr[j]<arr[j-1])){
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
          j--;
       }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    }
  }

//Time Complexity:
//BC:O(N)
//WC:O(N^2)
//AC:O(N^2)
 
