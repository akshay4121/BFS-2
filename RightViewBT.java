/* Tc: O(n) n:no. nodes in the tree. 
 *  SC: O(n) n:no. nodes in the tree. 
 *  Approach: I will be performing Breadth first search on the tree and on each level and visit my nodes on the level, at each level i will add the first node to my result list.
 */


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

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();


        if(root == null) return result;

        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i< len; i++){
                TreeNode curr = q.poll();
                if(i == 0) result.add(curr.val);
                if(curr.right != null) q.add(curr.right);
                if(curr.left != null) q.add(curr.left);
            }
        }
     return result;   
    }
}