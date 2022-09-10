import java.util.*;
class Main {
  public static void MergeSort(int []arr,int low,int high){
    if(high==low){
      return;
    }
    int mid=low+(high-low)/2;
    MergeSort(arr,low,mid);
    MergeSort(arr,mid+1,high);
    Merge(arr,high,mid,low);
  }
  public static void Merge(int []a,int high,int mid,int low)  {
    int i=low,j=mid+1;
    int  m[]=new int[high+1];
    int k=low;
    while(i<=mid && j<=high){
      if(a[i]>a[j]){
        m[k++]=a[j];
        j++;
      }else{
        m[k++]=a[i];
        i++;
      }
    }while(i<=mid){
      m[k++]=a[i++];
    }while(j<=high){
      m[k++]=a[j++];
    }
    for(int x=low;x<=high;x++){
      a[x]=m[x];
    }
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    MergeSort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
// Time Complexity:
// BC:O(NlogN)
// WC:O(NlogN)
// AC:O(NlogN)
