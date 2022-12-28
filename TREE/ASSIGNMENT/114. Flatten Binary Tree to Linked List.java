class Solution {
    public TreeNode flatten(TreeNode root) {
        if(root==null) return null;
      
        TreeNode rightTail=flatten(root.right);
        TreeNode leftTail=flatten(root.left);
        while(root.left!=null){
            leftTail.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return (rightTail!=null)?rightTail:((leftTail!=null)?leftTail:root);
    }
}
