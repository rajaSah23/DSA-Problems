/*Structure of the Node of the BST is as
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}
*/

class Solution
{
    static void inorder(Node root,HashSet<Integer> hs){
        if(root==null) return;
        
        inorder(root.left,hs);
        hs.add(root.data);
        inorder(root.right,hs);
    }
    static int countPair(Node root1,HashSet<Integer> hs,int x){
        if(root1==null) return 0;
        int left=countPair(root1.left,hs,x);
        int right=countPair(root1.right,hs,x);
        
        if(hs.contains(x-root1.data)) 
            return left+right+1;
        else return left+right;
        
    }
	public static int countPairs(Node root1, Node root2, int x)
	{
		HashSet<Integer> tree2= new HashSet<>();
		inorder(root2,tree2);
		return countPair(root1,tree2,x);
		
	}
}
