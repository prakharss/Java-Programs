class BoundaryTraversal {
	static void printBoundary(TreeNode root)
	{
		if(root!=null)
		{
			System.out.print(root.val+" ");
			BoundaryTraversal.leftSide(root.left);
			BoundaryTraversal.leafs(root);
			BoundaryTraversal.rightSide(root.right);
		}
	}
	
	static void leftSide(TreeNode root)
	{
		if(root == null)
			return ;
		
		if(root.left != null)
		{
			System.out.print(root.val+" ");
			leftSide(root.left);
		}
		else if(root.right != null)
		{
			System.out.print(root.val+" ");
			leftSide(root.right);
		}
	}
	
	static void leafs(TreeNode root)
	{
		if(root==null)
			return ;
		
		if(root.left == null && root.right == null)
			System.out.print(root.val + " ");
		
		leafs(root.left);
		leafs(root.right);
	}
	
	static void rightSide(TreeNode root)
	{
		if(root == null)
			return ;
		
		if(root.right != null)
		{
			rightSide(root.right);
			System.out.print(root.val+" ");
		}
		else if(root.left != null)
		{
			rightSide(root.left);
			System.out.println(root.val+" ");
		}
	}
}
