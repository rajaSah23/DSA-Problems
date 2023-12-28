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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int lev=0;
        while(!q.isEmpty()){
            List<Integer> list= new ArrayList<>();
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode node= q.poll();
                list.add(node.val);

                if(node.left!= null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
                
            }
            if(lev%2==1)//odd level
                Collections.reverse(list);
            lev++;
            ans.add(list);
        }
        return ans;
    }
}