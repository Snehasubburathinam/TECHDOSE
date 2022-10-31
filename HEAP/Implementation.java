import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n+1];
    for(int i=1;i<=n;i++){
      a[i]=sc.nextInt();
    }
    Max_Heap(a);
    for(int j=1;j<a.length;j++){
      System.out.print(a[j]+" ");
    }
    Heap_IncreaseKey(a,2,1);
    Heap_DecreaseKey(a,-3,2);
    System.out.println();
    for(int j=1;j<a.length;j++){
      System.out.print(a[j]+" ");
    }
  }
  public static void swap(int []a,int x,int y){
    int temp=a[x];
    a[x]=a[y];
    a[y]=temp;
  }
  public static void Max_Heap(int []a){
    int n=a.length-1;
    for(int i=n/2;i>=1;i--){
      heapify(a,i);
    }
  }
  public static void heapify(int []a,int i){
     if(i>(a.length-1)/2){
       return;
     } 
    int l=i*2;
    int r=i*2+1;
    int max=i;
    if(l<a.length && a[l]>a[max]){
      max=l;
    }
    if(r<a.length && a[r]>a[max]){
      max=r;
    }
    if(max!=i){
      swap(a,max,i);
      heapify(a,max);
    }
  }
  public static void Heap_Pop(int []a){
    int l=a.length-1;
    a[1]=a[l];
    heapify(a,1);
  }
  public static void Heap_Extract(int []a){
    int l=a.length-1;
    int res=a[1];
    a[1]=a[l];
    a[l]=0;
    heapify(a,1);
    
  }
  public static void Heap_IncreaseKey(int []a,int diff,int i) {
    if(diff<0){
      System.out.println("Invalid");
      return;
    }
    a[i]+=diff;
    while(i<1 && a[i/2]<a[i]){
      swap(a,i/2,i);
      i/=2;
    }
  }
  public static void Heap_DecreaseKey(int []a,int diff,int i) {
    if(diff>=0){
      System.out.println("Invalid");
      return;
    }
    a[i]+=diff;
    heapify(a,i);
  }
}
