import java.util.*;
public class QueueUsingJCF
{
public static void main(String gg[])
{
//Queue<Integer> q=new LinkedList<>();
Queue<Integer> q=new ArrayDeque<>();
q.add(4);
q.add(3);
q.add(2);

while(!q.isEmpty())
{
System.out.println(q.peek());
q.remove();
}
}
}