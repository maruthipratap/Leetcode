/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(cloned,target);
    }
    public TreeNode search(TreeNode c, TreeNode t){
        if(c==null) return null;
        if(c.val==t.val) return c;
        TreeNode left=search(c.left,t);
        TreeNode right=search(c.right,t);
        if(left!=null) return left;
        if(right!=null)return right;
        return null;
    }
}