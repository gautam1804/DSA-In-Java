import java.util.*;
public class LowestCommonAncestorOptimal
{
static class Node
{
int data;
Node left;
Node right;

public Node(int data)
{
this.data=data;
left=null;
right=null;
}
}




    //Function to return the lowest common ancestor in a Binary Tree.
//time complexity-- O(n) but less space complexity
	public static Node lca(Node root, int n1,int n2)
	{
		if(root==null || root.data==n1 || root.data==n2) return root;
		
	Node leftLca=lca(root.left,n1,n2);
	Node rightLca=lca(root.right,n1,n2);

	if(rightLca==null) return leftLca;
	if(leftLca==null) return rightLca;
	
	//if both are not null then I(current node) is a parent/ansector;
	return root;
       
		
	} 

public static void main(String gg[])
{

Node root=new Node(1);
 root.left=new Node(2);
 root.right=new Node(3);
 root.left.left=new Node(4);
 root.left.right=new Node(5);
 root.right.left=new Node(6);
 root.right.right=new Node(7);


System.out.println(lca(root,4,5).data);
}
}