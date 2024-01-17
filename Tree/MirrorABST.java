import java.util.*;
public class MirrorABST
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

//Mirror of BST=preOrder but for BST=inorder
public static void preOrder(Node root)
{
if (root==null) return;

System.out.print(root.data+" ");
preOrder(root.left);
preOrder(root.right);

}
//time complexity- O(n)
public static Node createMirror(Node root)
{
if(root==null) return null;

Node leftM=createMirror(root.left);
Node rightM=createMirror(root.right);

root.left=rightM;
root.right=leftM;

return root;
}

public static void main(String gg[])
{

Node root=new Node(8);
 root.left=new Node(5);
 root.right=new Node(10);
 root.left.left=new Node(3);
 root.left.right=new Node(6);
 root.right.right=new Node(11);


preOrder(createMirror(root));
}
}