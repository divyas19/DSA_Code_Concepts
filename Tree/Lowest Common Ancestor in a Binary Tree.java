class Solution
{
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root == null)
		return null;
		
		if(root.data == n1 || root.data == n2)
		return root;
		
		Node l = lca(root.left,n1,n2);
		Node r = lca(root.right,n1,n2);
		
		if(l== null) return r;
		if(r==null) return l;
		
		return root;
	}
}

