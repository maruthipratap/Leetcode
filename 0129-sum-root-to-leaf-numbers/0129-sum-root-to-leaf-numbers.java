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
    static int ans;
    public int sumNumbers(TreeNode root) {
        ans=0;
        pathSum(root,ans);
        return ans;
    }
    public void pathSum(TreeNode root,int sum){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            ans+=sum*10+root.val;
        }
        if(root.left!=null){
            pathSum(root.left,sum*10+root.val);
        }
        if(root.right!=null){
            pathSum(root.right,sum*10+root.val);
        }

    }
}