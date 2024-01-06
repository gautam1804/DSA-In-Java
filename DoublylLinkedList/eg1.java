class DoublyLL
{
public class Node 
{
int data;
Node next;
Node prev;


public Node(int data)
{
this.data=data;
this.next=null;
this.prev=null;
}
}

public static Node head;
public static Node tail;
public static int size;

public void addFirst(int data)
{
Node newNode=new Node(data);
size++;

if(head==null)
{
head=tail=newNode;
return;
}

newNode.next=head;
head.prev=newNode;

head=newNode; //ye bhule apn
}

public void print()
{
Node temp=head;

while(temp!=null)
{
System.out.print(temp.data+"<->");
temp=temp.next;
}System.out.println("null");

}

public int removeFirst()
{
if(head==null)
{
System.out.println("DLL is empty");
return Integer.MIN_VALUE;
}

if(size==1)
{
int val=head.data;
head=tail=null;
size--;
return val;
}

int delVal=head.data;
size--;
head=head.next;
head.prev=null; //this line give error for single element in dll.
return delVal;
}

public static void main(String gg[])
{
DoublyLL dll=new DoublyLL();
dll.addFirst(3);
dll.addFirst(2);
dll.addFirst(1);
dll.print();
System.out.println(dll.size);
System.out.println(dll.removeFirst()+" is deleted from DLL");
dll.print();
System.out.println(dll.size);
}

}