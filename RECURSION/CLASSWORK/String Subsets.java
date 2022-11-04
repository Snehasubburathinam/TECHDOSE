import java.util.*;
class Main {
  static List<String>list=new ArrayList<>();
  static String cur="";
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    subset(s,0,cur);
    System.out.println(list);
  }
  public static void subset(String s,int pos,String cur){
    if(pos==s.length()){
      list.add(cur);
      return ;
    }
    subset(s,pos+1,cur);
    cur=cur+s.charAt(pos);
    subset(s,pos+1,cur);
  }
}
