import java.util.*;
public class ValidBST
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

public static Node findInorderSuccessor(Node root)
{
while(root.left!=null)
{
root=root.left;
}
return root;
}

public static Node delete(Node root,int val)
{
//extra if() expereince from coding plateforms
 if (root == null) {
        return null;
    }

if(root.data<val)
{
root.right=delete(root.right,val);
}
else if(root.data>val)
{
root.left=delete(root.left,val);
}
else
{
//best 
//case 1- leaf node
if(root.left==null && root.right==null)
{
return null;
}

//case -2 - single child
if(root.left==null)
{
return root.right;
}
else if(root.right==null)
{
return root.left;
}

//case -3 -both children
Node IS=findInorderSuccessor(root.right);
root.data=IS.data;
root.right=delete(root.right,IS.data);

}

return root;
} 

public static void inorder(Node root)
{
if(root==null) return;

inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
}

public static Node insert(Node root,int val)
{
if(root==null) 
{
root=new Node(val);
return root;
}

if(root.data>val)
{
root.left=insert(root.left,val);
}
else
{
root.right=insert(root.right,val);
}

return root;

}

public static void printPath(ArrayList<Integer> path)
{
for(int i=0;i<path.size();i++) 
{
System.out.print(path.get(i)+"->");
}System.out.println("Null");
}

public static boolean isValidBST(Node root,Node min,Node max)
{
if(root==null) return true;

if(min!=null && min.data >= root.data)
{
return false;
}

else if(max!=null && max.data <= root.data)
{
return false;
}

return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
}

public static void main(String gg[])
{
int values[]={8,5,3,6,10,11,14};
Node root=null;

for(int i=0;i<values.length;i++)
{
root=insert(root,values[i]);
}

inorder(root);//to over insert is right or wrong
System.out.println();


System.out.println(isValidBST(root,null,null));
}
}