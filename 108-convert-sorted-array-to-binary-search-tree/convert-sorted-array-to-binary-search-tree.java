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
    TreeNode sortedArrayToBST(int[] nums,int s, int e){
        if(s>e) return null;

        int mid= s+(e-s)/2;
        TreeNode root= new TreeNode(nums[mid]);

        TreeNode leftSubtree=sortedArrayToBST(nums,s,mid-1);
        TreeNode rightSubtree=sortedArrayToBST(nums,mid+1,e);

        root.left=leftSubtree;
        root.right=rightSubtree;

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
}