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
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> list=postorderTraversal2Stack(TreeNode root);
        List<Integer> list=postorderTraversal1Stack(root);
        return list;
    }
    public List<Integer> postorderTraversal2Stack(TreeNode root)
    {
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root!=null)
          st1.push(root);
        while(!st1.isEmpty())
        {
            TreeNode node=st1.pop();
            st2.push(node);
            if(node.left!=null)
               st1.push(node.left);
            if(node.right!=null)
               st1.push(node.right);
        }
        while(!st2.isEmpty())
        {
            list.add(st2.pop().val);
        }
        return list;
    }
    public List<Integer> postorderTraversal1Stack(TreeNode root)
    {
        Stack<TreeNode>st=new Stack<>();
        List<Integer>list=new ArrayList<>();
        TreeNode curr=root;
        TreeNode lastVisited=null;
        while(curr!=null || !st.isEmpty())
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                TreeNode peek=st.peek();
                if(peek.right!=null && lastVisited!=peek.right)
                {
                    curr=peek.right;
                }
                else
                {
                    list.add(peek.val);
                    lastVisited=st.pop();
                }
            }
        }
        return list;
    }

}