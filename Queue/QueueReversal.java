import java.util.*;
public class QueueReversal
{
public void rev(Queue<Integer> q){
        //add code here.
         Stack<Integer> s=new Stack<>();

        while(!q.isEmpty())
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }
public static void main(String gg[])
{
QueueReversal i=new QueueReversal();
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


i.rev(q);

while(!q.isEmpty())
{
System.out.print(q.peek()+" ");
q.remove();
}
}
}