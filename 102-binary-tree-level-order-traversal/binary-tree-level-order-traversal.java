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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> tr=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        if(root!=null)
        {
            q.add(root);
            q.add(null);
        }
        while(!q.isEmpty())
        {
            TreeNode node=q.remove();
            if(node!=null)
            {
                list.add(node.val);
                if(node.left!=null)
                   q.add(node.left);
                if(node.right!=null)
                   q.add(node.right);
            }
            else
            {
                tr.add(list);
                if(q.isEmpty())
                   break;
                q.add(null);
                list=new ArrayList<>();
            }
        }
        return tr;
    }
}