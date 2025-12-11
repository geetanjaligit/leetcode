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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode>st=new Stack<>();
        List<Integer>list=new ArrayList<>();
        TreeNode node=root;
        if(node!=null)
           st.push(node);
        while(!st.isEmpty())
        {
            node=st.pop();
            list.add(node.val);
            if(node.right!=null)
               st.push(node.right);
            if(node.left!=null)
               st.push(node.left);
        } 
        return list;

    }
}