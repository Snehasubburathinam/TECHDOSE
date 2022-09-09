import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
      int mean=sum/n;
      System.out.println("Mean is "+mean);
    /*median*/
    if(n%2!=0){
      System.out.println("Median is "+(n+1)/2);
    }else{
      System.out.println("Median is "+((n/2)+((n/2)+1))/2);
    }
    /*Mode*/
    int maxVal=0,count=0,maxCount=0;
    for(int i=0;i<n;i++){
      count=0;
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j]){
           count++;
        }
      }
      if(count>maxCount){
        maxCount=count;
        maxVal=arr[i];
      }
    }
    System.out.println("Mode is "+maxVal+",count is "+maxCount);
  }
}
