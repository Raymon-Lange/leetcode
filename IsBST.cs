public class Solution {
    public  bool IsBST(TreeNode root, int? minVal, int? maxVal)
    {
        if(root is null){
            return true;
        }
        
        if(minVal.HasValue && minVal >= root.val ||
          maxVal.HasValue && maxVal <= root.val)
            return false;
        
        return (
            IsBST(root.left, minVal, root.val) &&
            IsBST(root.right, root.val, maxVal)
        );
        
    }
    
    public bool IsValidBST(TreeNode root) {
        return IsBST(root, null, null);
        
    }
}
