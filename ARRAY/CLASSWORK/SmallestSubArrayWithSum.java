import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n[]={1,5,2,1,3,6,1,2,1,1,1,0,10,0,1,1,1};
    int l=n.length;
    int target=6;
    int j=0;
    int s=0;
    int r=0;
    for(int i=0;i<l;i++){
      s+=n[i];
      while(s>target){
        s-=n[j];
        j++;
      }
      r=Math.max(r,i-j+1);
    }
    System.out.println(r);
  }
}
