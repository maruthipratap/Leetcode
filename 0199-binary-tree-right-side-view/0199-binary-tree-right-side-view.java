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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int size=1;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            size--;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null)q.add(node.right);
            if(size==0){
                list.add(node.val);
                size=q.size();
            }
        }
        return list;
    }
}