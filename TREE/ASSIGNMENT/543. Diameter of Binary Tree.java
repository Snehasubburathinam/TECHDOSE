class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int h=Math.max(leftHeight+rightHeight,Math.max(left,right));
        return h;
    }
    public int height(TreeNode root){
        return (root==null)?0:1+Math.max(height(root.left),height(root.right));
    }
}
