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
    List<String> list=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        helper(root,sb);
        return list;
    }
    public void helper(TreeNode root,StringBuilder sb){
        if(root==null){ 
            return;
        }
        int len=sb.length();
        if(sb.length()>0) sb.append("->");
        sb.append(root.val);
        if(root.left==null &&root.right==null){
            list.add(sb.toString());
        }else{        
            helper(root.left,sb);
            helper(root.right,sb);
        }
        sb.setLength(len);
    }
}