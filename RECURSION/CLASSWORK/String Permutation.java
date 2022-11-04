import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String res=";
    permutation(s,res);
  }
  public static void Permutation(String s,String res){
   if(s.length()==0){
      System.out.println(res+" ");
     return;
  }
  for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
     String left=str.substring(0,i);
     String right=str.substring(i+1);
     permutation(left+right,res+ch);
  }
 }
}
