// Last updated: 04/10/2025, 15:50:11
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
    public boolean checkTree(TreeNode root) {
        int sum = 0;
        while(root.left!=null){
            sum+=root.left.val;
            root.left = root.left.left;
        }
        while(root.right!=null){
            sum+=root.right.val;
            root.right = root.right.right;
        }
        return root.val == sum;
    }
}