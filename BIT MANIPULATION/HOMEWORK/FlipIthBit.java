import java.util.*;
class Main {
  public static int setIthBit(int n,int pos){
       return n ^ (1<<(pos-1));
  }
  
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int pos=sc.nextInt();
     System.out.println(setIthBit(n,pos));
  }
}
