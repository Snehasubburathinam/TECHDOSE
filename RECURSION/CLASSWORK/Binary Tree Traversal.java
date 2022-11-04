package tree;
import java.util.*;
class TreeNode 
{
  int data;
  TreeNode left,right;
  TreeNode(int val){
    data=val;
    left=null;
    right=null;
  }
}
public class Main{
  static TreeNode root=null;
  static TreeNode tree(int a[],int k)
  {
    TreeNode root=null;
    if(k<a.length){
      root=new TreeNode(a[k]);
      root.left=tree(a,2*k);
      root.right=tree(a,2*k+1);
    }
    return root;
  }
static void preorder(TreeNode root){
  if(root!=null){
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }
}
static void inorder(TreeNode root){
  if(root!=null){
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
}
 static void postorder(TreeNode root){
  if(root!=null){
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
  }
}
  
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[]{0,1,2,3,4};
  Main t=new Main();
  t.root=tree(a,1);
  System.out.println("Preorder");
  preorder(t.root);
  System.out.println("\nInorder");
  inorder(t.root);
  System.out.println("\nPostorder");
  postorder(t.root);
  
  }
}
