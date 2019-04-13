class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val)
	{
		this.val=val;
		this.left=null;
		this.right=null;
	}
}

public class Controller {
	public static void main(String[] args)
	{
		TreeNode root=new TreeNode(20);
		root.left=new TreeNode(8);
		root.right=new TreeNode(22);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(12);
		root.right.right=new TreeNode(25);
		root.left.right.left=new TreeNode(10);
		root.left.right.left.right=new TreeNode(2);
		root.left.right.right=new TreeNode(14);
		
		BoundaryTraversal.printBoundary(root);
	}
}
