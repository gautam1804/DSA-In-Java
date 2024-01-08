import java.util.*;
public class DequeUsingJCF
{
public static void main(String gg[])
{
//Deque<Integer> dq=new LinkedList<>();
Deque<Integer> dq=new ArrayDeque<>();
dq.addFirst(4);
dq.addFirst(3);
System.out.println(dq);
dq.removeFirst();
System.out.println(dq);
dq.addFirst(33);
dq.addLast(34);
System.out.println(dq);

}
}