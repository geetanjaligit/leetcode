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
    int maxD=0;
    public int diameterOfBinaryTree(TreeNode root) {
        ht(root);
        return maxD;
    }
    public int ht(TreeNode root)
    {
        if(root==null)
           return 0;
        int leftht=ht(root.left);
        int rightht=ht(root.right);
        maxD=Math.max(maxD,leftht+rightht);
        return 1+Math.max(leftht,rightht);
    }
}