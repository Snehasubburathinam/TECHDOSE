import java.util.*;
class Main {
  public static void subset(ArrayList<ArrayList<Integer>> al, int[] arr, int n) {
    for (int i = 0; i < (1 << n); i++) {
      ArrayList<Integer> temp = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) > 0) {
          temp.add(arr[j]);
        }
      }
      al.add(temp);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer> >();
    subset(al, arr, n);
    System.out.print(al);
  }
}
