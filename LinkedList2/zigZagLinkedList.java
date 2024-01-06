class LinkedList
{
public static class Node
{
int data;
Node next;

public Node(int data) //data parameter rkhna he yad rkh
{
this.data=data;
this.next=null;
}
}

public static Node head;
public static Node tail;
public static int size;


//time complexity - O(1)
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
head=newNode;
}

//time complexity - O(1)
public void addLast(int data)
{
Node newNode=new Node(data);
size++;
if(head==null)
{
head=tail=newNode;
return;
}
tail.next=newNode;
tail=newNode;
}

//time complexity - O(n)
public void print()
{
if(head==null)
{
System.out.println("Empty Linked List");
return;
}
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println("null");
}

private static Node findMid(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static Node reverseSecondHalf(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private static void rearrange(Node leftHead, Node rightHead) {
        Node nextLeft;
        Node nextRight;

        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            leftHead.next = rightHead;

            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }
    }


	public static Node zigZagList(Node head)
	{
if (head == null) return null;

        Node mid = findMid(head);
        Node reversedSecondHalf = reverseSecondHalf(mid.next);
        mid.next = null; // Break the link to the second half.

        rearrange(head, reversedSecondHalf);

        return head;
	}


public static void main(String gg[])
{
LinkedList ll=new LinkedList();
ll.addFirst(5);
ll.addFirst(4);
ll.addFirst(3);
ll.addFirst(2);
ll.addFirst(1);

ll.print();
ll.head=ll.zigZagList(ll.head);
ll.print();
}
}
