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
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        h(root);
        return d;
    }
    public int h(TreeNode node){
        if(node == null) return 0;
        int left = h(node.left);
        int right = h(node.right);
        d = Math.max(d, left + right);
        return 1 + Math.max(left, right);
    }
}