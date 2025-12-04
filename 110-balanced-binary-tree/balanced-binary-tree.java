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
        if(leftht==-2)
           return -2;
        int rightht=height(root.right);
        if(rightht==-2)
           return -2;
        if(Math.abs(leftht-rightht)>1)
             return -2;
        return 1+Math.max(leftht,rightht);
    }
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-2;
        
    }             
}