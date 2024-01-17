public class DiameterNotOptimal
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

 static  int height(Node node) 
    {
        // code here 
        if(node==null) return 0;
        
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }
   

//time complextiy - O(n^2) why? see below 

   static int diameter(Node root) {
        // Your code here
        if(root == null)
        {
            return 0;
        }
        
        int ldiam=diameter(root.left);//time complextiy O(n) and took O(n) for calculating height for each nodes.
        int rdiam=diameter(root.right);
        int lh=height(root.left); 
        int rh=height(root.right);
        
        return Math.max(Math.max(ldiam,rdiam),(lh+rh+1)); //trick to find max between the 3 values
        
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

System.out.println(diameter(root));
}
}