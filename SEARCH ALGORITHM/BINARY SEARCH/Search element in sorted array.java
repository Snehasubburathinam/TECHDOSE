import java.util.*;

class Main {
  public static int BinarySearch(int[] nums, int target) {
    int pivot, left = 0, right = nums.length - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target){
        return pivot;
      }
      else if (target < nums[pivot]){ 
        right = pivot - 1;
      }
      else{
        left = pivot + 1;
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    System.out.println(BinarySearch(arr,target));
  }
}
//TIME COMPLEXITY
//BC:O(1)
//WC:O(logN)
