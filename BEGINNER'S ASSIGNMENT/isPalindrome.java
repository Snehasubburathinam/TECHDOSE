import java.util.*;
class Main {
  public static String isPalindrome(String str){
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    String rev=sb.toString();
    if(str.equals(rev)){
      return "Palindrome";
    }else{
      return "Not Palindrome";
    }
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println(isPalindrome(str));
  }
}
