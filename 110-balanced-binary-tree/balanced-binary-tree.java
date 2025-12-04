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
    public int height(TreeNode root)
    {
        if(root==null)
           return -1;
        int leftht=height(root.left);
        int rightht=height(root.right);
        return 1+Math.max(leftht,rightht);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
           return true;
        int leftht=height(root.left);
        int rightht=height(root.right);
        int diff=Math.abs(leftht-rightht);
        if(diff>1)
           return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }             
}