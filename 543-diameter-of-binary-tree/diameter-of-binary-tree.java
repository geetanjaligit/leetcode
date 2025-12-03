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
    public int ht(TreeNode root)
    {
        if(root==null)
           return 0;
        if(root.left==null && root.right==null)
           return 0;
        return 1+Math.max(ht(root.left),ht(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
           return 0;
        int dr=ht(root.left)+ht(root.right);
        if(root.left!=null)
           dr++;
        if(root.right!=null)
           dr++;
        int dil=diameterOfBinaryTree(root.left);
        int dir=diameterOfBinaryTree(root.right);
        return Math.max(dr,Math.max(dil,dir));
    }
}