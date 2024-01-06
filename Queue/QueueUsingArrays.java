public class QueueUsingArrays
{

static int arr[];
static int size;
static int rear;

QueueUsingArrays(int n)
{
arr=new int[n];
size=n;
rear=-1;
}

public static boolean isEmpty()
{
return rear==-1;
}

//Time complexity-- O(1)
public static void add(int data)
{
if(rear==(size-1))
{
System.out.println("Queue is full");
return;
}

rear=rear+1;

arr[rear]=data;

}


//Time complexity-- O(n) thus it is not preferred to implement queue using Arrays
public static int remove()
{
if(isEmpty())
{
System.out.println("Queue is empty");
return -1;
}

int front=arr[0];
for(int i=0;i<rear;i++)
{
arr[i]=arr[i+1];
}

rear=rear-1;

return front;
}

public int peek()
{
if(isEmpty())
{
System.out.println("Queue is empty");
return -1;
}

return arr[0];
}
public static void main(String gg[])
{
QueueUsingArrays q=new QueueUsingArrays(5);
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