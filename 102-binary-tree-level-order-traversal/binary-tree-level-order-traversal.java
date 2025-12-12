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
        List<List<Integer>> list=new ArrayList<>();
        int n=levelOfTree(root);
        for(int i=1;i<=n;i++)
        {
            list.add(bfs(root,i));
        }
        return list;
    }
    public int levelOfTree(TreeNode root)
    {
        if(root==null)
           return 0;
        int leftHt=levelOfTree(root.left);
        int rightHt=levelOfTree(root.right);
        return 1+Math.max(leftHt,rightHt);
    }
    public List<Integer> bfs(TreeNode root,int level)
    {
        List<Integer> list=new ArrayList<>();
        if(root==null)
           return list;
        if(level==1)
        {
            list.add(root.val);
            return list;
        }
        List<Integer>left=(bfs(root.left,level-1));
        List<Integer>right=(bfs(root.right,level-1));
        list.addAll(left);
        list.addAll(right);
        return list;
        
    }
}