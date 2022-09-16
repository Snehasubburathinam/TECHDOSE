import java.util.*;
class Main {
  public static int Max(int a[]){
    int n = a.length;  
    int max = a[0];  
    for (int i = 1; i < n; i++)  
    if (a[i] > max)  
    max = a[i];  
    return max;  
}  
public static void BucketSort(int a[])   
{  
    int n = a.length;  
    int max = Max(a);   
    int bucket[] = new int[max+1];   
    for (int i = 0; i <= max; i++)  
    {  
        bucket[i] = 0;  
    }  
    for (int i = 0; i < n; i++)  
    {  
        bucket[a[i]]++;  
    }  
    for (int i = 0, j = 0; i <= max; i++)  
    {  
        while (bucket[i] > 0)  
        {  
            a[j++] = i;  
            bucket[i]--;  
        }  
    }  
}  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    BucketSort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
} 
//Time Complexity :O(N^2)
