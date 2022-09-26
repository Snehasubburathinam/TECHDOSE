import java.util.*;
class Main {
     static int InvCount(int n,int [] arr)
     {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
        return inv_count;
    }
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
     }
    System.out.println(InvCount(n,arr));
    }
}
