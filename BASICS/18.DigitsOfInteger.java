import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[100];
    int i=0;
    while(n!=0){
      int x= n%10;
      arr[i]=x;
      i++;
      n=n/10;
    }
    for(int j=i-1;j>=0;j--){
      System.out.println(arr[j]);
    }
  }
}
