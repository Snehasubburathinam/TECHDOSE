import java.util.*;

public class Main
{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int val){
      this.data=val;
      this.next=null;
    }
  }
  static int multiply(Node l1,Node l2){
    int n1=0;
    int n2=0;
    while(l1!=null && l2!=null){
      if(l1!=null){
        n1=n1*10+l1.data;
        l1=l1.next;
      }
      if(l2!=null){
        n2=n2*10+l2.data;
        l2=l2.next;
      }
    }
    return n1*n2;
  }

  public static void main(String[] args) {
    Node l1=new Node(10);
    l1.next=new Node(2);
    Node l2=new Node(1);
    l2.next=new Node(5);
    System.out.println(multiply(l1,l2));
  }
}
