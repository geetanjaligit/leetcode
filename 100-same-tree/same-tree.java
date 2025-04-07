/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p, q);
    }
    
    public boolean helper(TreeNode p, TreeNode q) {
        // Base case: if both nodes are null, they are identical.
        if (p == null && q == null) return true;
        
        // If one of the nodes is null or the values do not match, return false.
        if (p == null || q == null || p.val != q.val) return false;
        
        // Recursively compare the left subtrees and right subtrees.
        return helper(p.left, q.left) && helper(p.right, q.right);
    }
}