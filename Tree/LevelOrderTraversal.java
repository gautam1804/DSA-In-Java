import java.util.*;
public class LevelOrderTraversal
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

//time complexity - O(N) because one node is kept in queue for 1 time and removed for 1 time. so n+n = 2n thus O(N)
public static void levelOrder(Node root)
{
if(root==null) return;

Queue<Node> q=new LinkedList<>();
q.add(root);
q.add(null);

while(!q.isEmpty())
{
Node currNode=q.remove();//NAT

if(currNode==null)
{
System.out.println();
if(q.isEmpty())
{
break;
}else
{
q.add(null);
}

}
else{
System.out.print(currNode.data+" ");
if(currNode.left!=null)
{
q.add(currNode.left);
}
if(currNode.right!=null){

q.add(currNode.right);
}
}

}


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


levelOrder(root);
}
}