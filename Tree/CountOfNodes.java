import java.util.*;
public class CountOfNodes
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

//time complexity- O(n) because we are traversing a node only one time
public static int countNodes(Node root)
{
if(root==null) return 0; 

int leftCount=countNodes(root.left);
int rightCount=countNodes(root.right);

return leftCount+rightCount+1;
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


System.out.println(countNodes(root));
}
}