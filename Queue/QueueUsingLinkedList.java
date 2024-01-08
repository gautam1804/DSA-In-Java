class Node
{
int data;
Node next;

Node(int data)
{
this.data=data;
this.next=null;
}
}

public class QueueUsingLinkedList
{

static Node head=null;
static Node tail=null;

public static boolean isEmpty()
{
return (head==null && tail==null);
}

//Time complexity-- O(1)
public static void add(int data)
{
Node newNode=new Node(data);
if(isEmpty())
{
head=tail=newNode;
return;
}
tail.next=newNode; //head tail confusion hua tha 
tail=newNode;//newNode=tail doesn't make any sense
}


//Time complexity-- O(1) 
public static int remove()
{
if(isEmpty())
{
System.out.println("Queue is empty");
return -1;
}
int val=head.data;
if(head==tail)
{
head=tail=null;
return val;
}

head=head.next;
return val;
}

//O(1)
public int peek()
{
if(isEmpty())
{
System.out.println("Queue is empty");
return -1;
}

return head.data;
}

public static void main(String gg[])
{
QueueUsingLinkedList q=new QueueUsingLinkedList();
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