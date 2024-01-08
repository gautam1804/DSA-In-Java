import java.util.*;
public class StackUsingTwoQueue
{
Queue<Integer> q1;
    Queue<Integer> q2;
    
public StackUsingTwoQueue() {
        q1=new LinkedList<Integer>();
         q2=new LinkedList<Integer>();
    }
    
    public void push(int x) {
    if(!q1.isEmpty())
    {
        q1.add(x);
    }
    else
    {
        q2.add(x);
    }
    }
    
    public int pop() {
        if(empty()) return -1;

        int top=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top=q1.remove();
                if(q1.isEmpty())
                {
                    break;
                }
                q2.add(top);
            }
        }
        else
        {
while(!q2.isEmpty())
            {
                top=q2.remove();
                if(q2.isEmpty())
                {
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
    
    public int peek() {
         if(empty()) return -1;

        int top=-1;
        if(!q1.isEmpty())
        {
            while(!q1.isEmpty())
            {
                top=q1.remove();
               
                q2.add(top);
            }
        }
        else
        {
while(!q2.isEmpty())
            {
                top=q2.remove();
               
                q1.add(top);
            }
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

public static void main(String gg[])
{
StackUsingTwoQueue s=new StackUsingTwoQueue();
s.push(4);
s.push(3);
s.push(2);

while(!s.empty())
{
System.out.println(s.peek());
s.pop();
}
}
}