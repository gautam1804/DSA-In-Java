public class SubTree
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

 public static boolean isIdentical(Node T, Node subRoot)
	{
		//base case

		if(T==null && subRoot==null)
		{
			return true;
		}
		else if(T ==null || subRoot==null || T.data!=subRoot.data)
		{
			return false;
		}

		if(!isIdentical(T.left,subRoot.left))
		{
			return false;
		}
		if(!isIdentical(T.right,subRoot.right))
		{
			return false;
		}
		return true;
	}
   

//time complextiy - O(n) because we calculate both by residing on a single node. and passing info type object

public static boolean isSubtree(Node root,Node subRoot) {
        
        if(root == null)
        {
            return false;
        }

        if(root.data==subRoot.data)
		{
			if(isIdentical(root,subRoot)) return true;
		}
        // boolean leftAns=isSubtree(T.left, S);
		// boolean rightAns=isSubtree(T.right, S);

		// return leftAns||rightAns;

		//more efficient
		return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
        
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

Node subroot=new Node(2);
 subroot.left=new Node(4);
 //subroot.right=new Node(5);
 
System.out.println(isSubtree(root,subroot));
}
}