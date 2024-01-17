import java.util.*;
public class TopView
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

 static class Info{
        Node node;
        int horid;

        public Info(Node node,int horid)
        {
            this.node=node;
            this.horid=horid;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
      
      //Level order

      Queue<Info> q=new LinkedList<>();

      HashMap<Integer,Node> map=new HashMap<>();

      int min=0,max=0;

      q.add(new Info(root,0));
      q.add(null);

      while(!q.isEmpty())
      {
          Info curr=q.remove();

          if(curr==null)
          {
              if(q.isEmpty())
              {
                  break;
              }
              else
              {
                  q.add(null);
              }
          }
          //gives error without else block because as above if condition say that curr is null ,so below will give Exception
            else
            {
          if(!map.containsKey(curr.horid))
          {
              map.put(curr.horid,curr.node);
          }
         
          if(curr.node.left!=null)
          {
              q.add(new Info(curr.node.left,curr.horid-1));
              min=Math.min(min,curr.horid-1);
          }

          if(curr.node.right!=null)
          {
              q.add(new Info(curr.node.right,curr.horid+1));
              max=Math.max(max,curr.horid+1);
          }
}
          }

          for(int i=min;i<=max;i++)
    {
        ans.add(map.get(i).data);
    }
    return ans;
        
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


System.out.println(topView(root));
}
}