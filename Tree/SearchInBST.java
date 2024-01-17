import java.util.*;
public class SearchInBST
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

//time complexity - O(H) means height of the tree means O(log(n)) but for skewed tree it is O(n)
public static boolean search(Node root, int key) {
        // Your code here
        if(root==null) return false;
        
        if(root.data==key) return true;

            
        if(root.data<key)
        {
            return search(root.right,key);
        }
        else
        {
            return search(root.left,key);
        }

        }
 


public static void main(String gg[])
{
//Since it is a BST so thus  4 2 6 1 3 5 7
Node root=new Node(4);
 root.left=new Node(2);
 root.right=new Node(6);
 root.left.left=new Node(1);
 root.left.right=new Node(3);
 root.right.left=new Node(5);
 root.right.right=new Node(7);


System.out.println(search(root,9));
}
}