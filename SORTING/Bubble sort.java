import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=n-1;i>=0;i--){
      boolean isSwapped=false;
      for(int j=0;j<i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          isSwapped=true;
        }
      }
      if(isSwapped==false){
        break;
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
// Time complexity:
// BC=O(n)
// WC=O(n^2)
// AC=O(n^2)
