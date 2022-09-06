import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> factors=new ArrayList<>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
        factors.add(i);
        if((i*i)!=n){
          factors.add(n/i);
        }
      }
    }
    Collections.sort(factors);
    System.out.print(factors);
  }
}
