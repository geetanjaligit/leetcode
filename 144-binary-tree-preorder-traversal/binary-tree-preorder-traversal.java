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
    static void preOrder1(TreeNode root, List<Integer> list) { //recursive approach
        if (root == null)
            return;
        list.add(root.val);
        preOrder1(root.left, list);
        preOrder1(root.right, list);
    }

    static void preOrder2(TreeNode root, List<Integer> list) { //iterative approach
        Stack<TreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (!st.isEmpty()) {
            TreeNode front = st.pop();
            list.add(front.val);
            if (front.right != null)
                st.push(front.right);
            if (front.left != null)
                st.push(front.left);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder2(root, list);
        return list;
    }
}

