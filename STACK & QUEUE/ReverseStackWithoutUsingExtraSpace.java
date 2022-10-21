import java.util.*;
public class Main{
  static Stack<Integer> s=new Stack<>();
    public static void main(String[] args){
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
      System.out.println(s);
      reverse();
      System.out.println(s);
  }
  static void reverse(){
    if(!s.isEmpty()){
      int t=s.peek();
      s.pop();
      reverse();
      insert(t);
    }
  }
  static void insert(int val){
    if(s.isEmpty()){
      s.push(val);
    }else{
      int p=s.peek();
      s.pop();
      insert(val);
      s.push(p);
    }
  }
}
