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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list; 
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean rev=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                li.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(!rev){
                list.add(li);
                rev=true;
            }else{
                Collections.reverse(li);
                list.add(li);
                rev=false;
            }
            
        }
        return list;
    }
}