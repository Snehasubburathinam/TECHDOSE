class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        inorder(root,res);
       return sortBST(res,0,res.size()-1);
    }
    public void inorder(TreeNode root,List<Integer>res){
     if(root!=null){
         inorder(root.left,res);
         res.add(root.val);
         inorder(root.right,res);
     } 
    }
    public TreeNode sortBST(List<Integer>res,int start,int end){
        if(start>end)return null;
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(res.get(mid));
        node.left=sortBST(res,start,mid-1);
        node.right=sortBST(res,mid+1,end);
        return node;
    }
}
