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

    //Function to sort the given linked list using Merge Sort.
    private static Node findMidNode(Node head)
    {
        if (head == null) {
        return null;
    }

        Node slow=head;
        Node fast=head.next;//small change its not fast=head; but its fast=head.next; to get correct mid(last node of first half)
        
        while(fast!=null&&fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    static Node merge(Node leftHead,Node rightHead)
    {
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        
        while(leftHead!=null && rightHead!=null)
    {
        if(leftHead.data<=rightHead.data)
        {
            temp.next=leftHead;
            leftHead=leftHead.next;//forgot
            temp=temp.next;
        }else
        {
            temp.next=rightHead;
            rightHead=rightHead.next;//forgot
            temp=temp.next;
        }
    }
    
    while(leftHead!=null)
    {
        temp.next=leftHead;
        leftHead=leftHead.next;//forgot
        temp=temp.next;
    }
       while(rightHead!=null)
    {
        temp.next=rightHead;
        rightHead=rightHead.next;//forgot
        temp=temp.next;
    } 
    
    return mergedLL.next;
    }
    static Node mergeSort(Node head)
    {
        //not came in mind
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node mid=findMidNode(head);
        Node rightHead=mid.next;
        mid.next=null;
        
        Node leftHalf=mergeSort(head);
        Node rightHalf=mergeSort(rightHead);
        return merge(leftHalf,rightHalf);
        
        
    }

public static void main(String gg[])
{
LinkedList ll=new LinkedList();
ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(3);
ll.addFirst(4);
ll.addFirst(5);

ll.print();
ll.head=ll.mergeSort(ll.head);
ll.print();
}
}
