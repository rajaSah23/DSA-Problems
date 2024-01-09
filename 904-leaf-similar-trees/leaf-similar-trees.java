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
    void findLeafs(TreeNode root,ArrayList<Integer>  ans){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            ans.add(root.val);

        findLeafs(root.left,ans);
        findLeafs(root.right,ans);
    }
     int i=0;
    boolean compareLeafs(TreeNode root,ArrayList<Integer>  tree1){
        if(root==null)
            return true;
        if(root.left==null && root.right==null){
            if(i>=tree1.size()||root.val!=tree1.get(i)){
                return false;
            }else{
                i++;
            }
        }
         return compareLeafs(root.left,tree1) && compareLeafs(root.right,tree1);
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>  arr1= new ArrayList<>();  
        findLeafs(root1,arr1);

        return compareLeafs(root2,arr1) && i==arr1.size();
    }
}