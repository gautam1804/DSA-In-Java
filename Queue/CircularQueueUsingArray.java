public class CircularQueueUsingArray
{

static int arr[];
static int size;
static int rear;
static int front;

CircularQueueUsingArray(int n)
{
arr=new int[n];
size=n;
rear=-1;
front=-1;
}

public static boolean isEmpty()
{
return (rear==-1 && front==-1);
}

public static boolean isFull()
{
return (rear+1)%size==front; //wrong ( return rear==front) 
}

//Time complexity-- O(1)
public static void add(int data)
{
if(isFull())
{
System.out.println("Queue is full");
return;
}

if(front==-1) front=0;

rear=(rear+1)%size;
//front will remain at 0;
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

int result=arr[front];
//if else not implemented BGT
if(rear==front)
{
rear=front=-1;
}
else
{
front=(front+1)%size;
}
//no change in rear because we are extracting only from front
return result;
}

public int peek()
{
if(isEmpty())
{
System.out.println("Queue is empty");
return -1;
}

return arr[front];
}


public static int Front() {
        if(!isEmpty())
        {

        return arr[front];
        }
        return -1;
    }
    
    public static int Rear() {
         if(!isEmpty())
        {

        return arr[rear];
        }
        return -1;
    }

public static void main(String gg[])
{
CircularQueueUsingArray q=new CircularQueueUsingArray(5);
q.add(1);
q.add(2);
q.add(3);
while(!q.isEmpty())
{
System.out.println(q.peek());
}
System.out.println("removed : "+q.remove());
q.add(4);
System.out.println("removed : "+q.remove());
q.add(5);
while(!q.isEmpty())
{
System.out.println(q.peek());
q.remove();
}
}
}