import java.util.*;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> binaryTreePaths(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Inorder(root,res);
        return res; 
    }

    public void Inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        Inorder(root.left,res);
        res.add(root.val);
        Inorder(root.right,res);
    } 
}