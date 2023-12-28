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
 class Info{
     int height;
     int diameter;
    Info(int h,int d){
        this.height=h;
        this.diameter=d;
    }
 }
class Solution {
    Info findDiameter(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo=findDiameter(root.left);
         Info rightInfo=findDiameter(root.right);

        int diam= leftInfo.height+rightInfo.height+1;
        int height=Math.max(leftInfo.height,rightInfo.height)+1;

        int largeDiam= Math.max(diam,Math.max(leftInfo.diameter,rightInfo.diameter));

        return new Info(height,largeDiam);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return findDiameter(root).diameter-1;
    }
}