// Last updated: 04/10/2025, 15:54:12
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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> res = new ArrayList<>();
        calculate(root,0,res,targetSum);
        return new ArrayList<>(result);
    }
    public void calculate(TreeNode root,int sum,List<Integer> res,int target){
        if(root == null){
            return;
        }
        res.add(root.val);
            sum+=root.val;
        if(root.left == null & root.right == null&sum==target){
            result.add(new ArrayList<>(res));
        }
        calculate(root.left,sum,res,target);
        calculate(root.right,sum,res,target);
        res.remove(res.size()-1);
    }
}