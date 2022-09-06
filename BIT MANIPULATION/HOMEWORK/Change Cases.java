import java.util.*;
class Main { 
  public static char toLowerCase(char ch){
    return  (char)((ch) | (1<<5));
  }
  public static char toUpperCase(char ch){
    return  (char)((ch) & (~(1<<5)));
  }
  public static char toToggleCase(char ch){
    return (char)(ch ^ (1<<5));
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     System.out.println(toLowerCase(ch));  
     System.out.println(toUpperCase(ch));
     System.out.println(toToggleCase(ch));
  }
}
