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

//time complexity O(n) but linkage concept takes only O(1) but In Array for finding data we have index and it takes O(1) but linkage concept i.e. copying array into new array takes O(n). 
public void add(int index,int data)
{

//Most Important
if(index==0)
{
addFirst(data); //nhi kiya to dekh head abhi b 2 ko hi point krega. to head ki value ko change krna zaruri he.
return;
}
Node temp=head;
int i=0;
while(i<index-1)
{
temp=temp.next;
i++;
}

Node newNode=new Node(data);
size++;
newNode.next=temp.next;
temp.next=newNode;
}

//return the deleted value
public int removeFirst()
{
// 2 special cases
if(size==0)
{
System.out.println("Empty Linked list");
return Integer.MIN_VALUE; //return -infinity
}
else if(size==1)
{
int val=head.data;
head=tail=null;
size=0;
return val;
}
int val=head.data;
head=head.next;
size--;
return val;
}

public int removeLast()
{
if(size==0)
{
System.out.println("Empty Linked List");
return Integer.MIN_VALUE;
}
else if(size==1)
{
int val=head.data;
head=tail=null;
size=0;
return val;
}

Node prev=head;
for(int i=0;i<size-2;i++)
{
prev=prev.next;
}

prev.next=null;
int val=tail.data;
tail=prev;
size--;
return val;
}

//time complexity O(n) - worst case
public int itrSearchKey(int key) {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
public int helper(Node head,int key)
{
if(head==null)
{
return -1;
}

if(head.data==key)
{
return 0;
}

int ind=helper(head.next,key);
if(ind==-1)
{
return -1;
}
else
{
return ind+1;
}
}

//Lecture 24.11 most imp. time complexity- O(n) due to helper function, space complexity O(n) due to call stack will use memory.
public int recrSearch(int key)
{
return helper(head,key);
}


//Lecture 24.12- most most imp
//time complexity O(n)
// 3 variables or 4 steps
public void reverse()
{
Node prev=null;
Node curr=tail=head;
Node next;

while(curr!=null)
{
next=curr.next;
curr.next=prev;//ye yad rkh bhai yar
prev=curr;
curr=next;
}
head=prev;
}

public void removeNthFromEnd(int n)
{
//calculate size
int sz=0;
Node temp=head;
while(temp!=null)
{
temp=temp.next;
sz++;
}

if(n==sz)
{
head=head.next;
return;
}

int trueInd=sz-n; //kyuki akhri se indexing 1 se start hogi or shuruwat se indexing 0 se .
Node prev=head;
for(int i=1;i<trueInd;i++)
{
prev=prev.next;
}

prev.next=prev.next.next;
size--;
}

public Node findMid(Node head)
{
Node slow=head; //turtle
Node fast=head; //hare

while(fast!=null && fast.next!=null)
{
slow=slow.next;//+1
fast=fast.next.next;//+2
}

return slow;

}

public boolean isPalindrome(Node head)
{
if(head==null || head.next==null) return true;
        Node mid = findMid(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) //curr.next likha tha - glt 
{
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) { //left!=null b likha tha - glt 
            if (left.data != right.data) { //left.data==right.data ka case likha tha - glt 
               return false;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return true;
}

public boolean hasCycle()
{
//Floyd's cycle finding algorithm - slow and fast pointer
Node slow=head;
Node fast=head;

if(slow==null) return false;

while(fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;

if(slow==fast) return true;
}

return false;
}

public void removeCycle()
{
Node slow=head;
Node fast=head;
Node prev=fast;
while(fast.next!=null && fast.next.next!=null)
{
slow=slow.next;
prev=fast.next;
fast=fast.next.next;
if(slow==fast)
{
slow=head;
while(slow!=fast)
{
slow=slow.next;
prev=fast;
fast=fast.next;
}
prev.next=null;
}
}
return;
}

public static void main(String gg[])
{
LinkedList ll=new LinkedList();
//ll.print();
ll.addFirst(1);
//ll.print();
ll.addFirst(2);
//ll.print();
ll.addLast(11);
//ll.print();
ll.addLast(22);
//ll.print();
//add in Middle
ll.add(0,45);
ll.print();
System.out.println("Size of linked list : "+LinkedList.size);
int val=ll.removeFirst();
System.out.println("Deleted value : "+val);
int val2=ll.removeLast();
System.out.println("Deleted value : "+val2);
ll.print();
System.out.println("Size of linked list : "+LinkedList.size); //time complexity O(1) but we don't take static variable we need a loop of O(n).

System.out.println(ll.itrSearchKey(2));
System.out.println(ll.recrSearch(1));

ll.addFirst(34);
ll.print();
ll.reverse();
ll.print();
ll.removeNthFromEnd(4);
ll.print();

head.next.next.next=head; //for creating cycle
System.out.println(ll.hasCycle()?"Yes, cycle is present":"No, cycle is not present");
ll.removeCycle();
System.out.println(ll.hasCycle()?"Yes, cycle is present":"No, cycle is not present");
}
}

