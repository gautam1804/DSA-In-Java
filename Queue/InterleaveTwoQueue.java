import java.util.*;
public class InterleaveTwoQueue
{
 public void interLeaveQueue(Queue < Integer > q) {
        //O(n)- both space and time complexity
        // Write your code here.
        int size=q.size();
        Queue<Integer> first=new LinkedList<>();

        for( int i=0;i<size/2;i++) //yha direct q.size() nhi likhna kyuki q me changes kr rhe to size b bar bar change hoga
        {
            first.add(q.remove());
        }

        while(!first.isEmpty())
        {
            q.add(first.remove());
            q.add(q.remove());
        }

        

    }
public static void main(String gg[])
{
InterleaveTwoQueue i=new InterleaveTwoQueue();
Queue<Integer> q=new ArrayDeque<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
q.add(7);
q.add(8);
q.add(9);
q.add(10);


i.interLeaveQueue(q);

while(!q.isEmpty())
{
System.out.print(q.peek()+" ");
q.remove();
}
}
}