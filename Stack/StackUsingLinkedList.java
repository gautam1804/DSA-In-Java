import java.util.LinkedList;

public class StackUsingLinkedList
{
static class Node 
{
int data;
Node next;

Node(int data)
{
this.data=data;
this.next=null;
}
}


static class Stack
{
static Node head=null;

public static boolean isEmpty()
{
return head==null; //return true if size is 0;
}

public static void push(int data)
{
Node newNode=new Node(data);

if(isEmpty()) 
{
head=newNode;
return;
}

newNode.next=head;
head=newNode;
}

public static int pop()
{
//special case 
if(isEmpty()) return -1;

int top=head.data; 
head=head.next;
return top;
}

public static int peek()
{
if(isEmpty()) return -1;
return head.data;
}
}


public static void main(String gg[])
{
Stack s=new Stack();
s.push(1);
s.push(2);
s.push(3);
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
while(!s.isEmpty())
{
System.out.println(s.peek());
s.pop();
}
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
}
}