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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasSum(root,targetSum,0);
    }
    public boolean hasSum(TreeNode root,int t,int crnt){
        if(root==null)return false;
        crnt+=root.val;
        if(root.left==null && root.right==null){
            return crnt==t;
        }
        if(root.left==null) return hasSum(root.right,t,crnt);
        if(root.right==null) return hasSum(root.left,t,crnt);
        return hasSum(root.left,t,crnt)||hasSum(root.right,t,crnt);
    }
}