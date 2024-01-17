public class PostOrderTraversal

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

//PreOrderTraversal -- time complexity- O(n)

public static void preOrderTraversal(Node root)
{
if(root==null)
{
System.out.print(-1+" ");
 return;
}
System.out.print(root.data+" ");
preOrderTraversal(root.left);
preOrderTraversal(root.right);
}


//InOrderTraversal -- time complexity- O(n)

public static void inOrderTraversal(Node root)
{
if(root==null)
{
System.out.print(-1+" ");
 return;
}

inOrderTraversal(root.left);//just swap left and root line no overthinking
System.out.print(root.data+" ");
inOrderTraversal(root.right);
}

//for coding ninjas and other plateforms

/* public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> l=new ArrayList<>();
        if(root==null)
        {
            return l;
        }
       
        l.addAll(getInOrderTraversal(root.left));
        l.add(root.data);
        l.addAll(getInOrderTraversal(root.right));
        return l;
    }*/


//PostOrderTraversal -- time complexity- O(n)

public static void postOrderTraversal(Node root)
{
if(root==null)
{
 return;
}

postOrderTraversal(root.left);//just swap left and root line no overthinking
postOrderTraversal(root.right);
System.out.print(root.data+" ");
}


}


public static void main(String gg[])
{
int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
BinaryTree tree=new BinaryTree();
Node root=tree.buildTree(nodes);

tree.postOrderTraversal(root);
}
}