import java.util.LinkedList;
public class jfcLinkedList
{
public static void main(String gg[])
{
LinkedList<Integer> ll=new LinkedList<>();

ll.addLast(3);
ll.addLast(4);
ll.addFirst(2);
ll.addFirst(1);
System.out.println(ll);

ll.removeLast();
ll.removeFirst();
System.out.println(ll);
}
}