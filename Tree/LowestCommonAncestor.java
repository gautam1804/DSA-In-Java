import java.util.*;
public class LowestCommonAncestor
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

public static boolean getPath(Node root,int n,ArrayList<Node> path)
    {
        if(root==null) return false;

        path.add(root);

        //forgot
        if(root.data==n) return true;

        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);

        if(foundLeft||foundRight) return true;

        path.remove(path.size()-1);

        return false;
    }


    //Function to return the lowest common ancestor in a Binary Tree.
//time complexity-- O(n) because n+n+n(see why) 3n
	public static Node lca(Node root, int n1,int n2)
	{
		// Your code here
		  ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1); //time complexity-- O(n)
        getPath(root,n2,path2);//time complexity-- O(n)

        int i=0;
        for(;i<path1.size()&& i<path2.size();i++) //time complexity-- O(n)
        {
            if(path1.get(i)!=path2.get(i)) break;
		
        }

        //last equal node is i-1th
        Node lca=path1.get(i-1);
        return lca;//i-1 because is on the place where we breaked.
		
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