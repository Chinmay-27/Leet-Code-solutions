class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}



class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // Both trees are empty
        }
        if (p == null || q == null) {
            return false; // One tree is empty, and the other is not
        }
        if (p.val != q.val) {
            return false; // The values of the current nodes do not match
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


