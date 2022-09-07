import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;i*i<=n;i++){
      while((n%i)==0){
        n/=i;
        System.out.print(i+" ");
        }
      }
    if(n>1){
      System.out.print(n+" ");
    }
  }
}
//method 2
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int k=0;
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        arr[k]=i;
        k++;
        if((i*i)!=n){
          arr[k]=n/i;
          k++;
        }
      }
    }
    for(int i=0;i<k;i++){
      for(int j=0;j<k;j++){
        int temp;
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<k;i++){
      System.out.printf("%d ",arr[i]);
    }
  }
}
