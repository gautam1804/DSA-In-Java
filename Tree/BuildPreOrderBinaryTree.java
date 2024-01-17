public class BuildPreOrderBinaryTree
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

static class BinaryTree
{
static int index=-1;

//time complexity- O(n)
public static Node buildTree(int nodes[])
{
index++;

if(nodes[index]==-1)
{
return null;
}

Node newNode=new Node(nodes[index]);
newNode.left=buildTree(nodes);//array pass krte time bs name likhte he na ki nodes[].
newNode.right=buildTree(nodes);

return newNode;

}

}


public static void main(String gg[])
{
int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree=new BinaryTree();
Node root=tree.buildTree(nodes);
System.out.println(root.data);
}
}