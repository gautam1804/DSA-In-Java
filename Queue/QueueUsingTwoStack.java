import java.util.*;
public class QueueUsingTwoStack
{
Stack<Integer> stk1, stk2;
    
public QueueUsingTwoStack() {
        stk1=new Stack<>();
		stk2=new Stack<>();
    }
    
//Time complextity= O(n)-> n+n=2n means n
    public void add(int x) {
        if(stk1.isEmpty())
	   {
	       stk1.push(x);
	       return ;
	   }
	   while(!stk1.isEmpty())
	   {
	       stk2.push(stk1.pop());
	   }
	   stk1.push(x);
	   while(!stk2.isEmpty())
	   {
	       stk1.push(stk2.pop());
	   }
	  }
    
    public int remove() {
        if(!stk1.isEmpty())
	  {
	   
	   return stk1.pop();
	  }
 System.out.println("Empty Queue");
	  return -1;
    }
    
    public int peek() {
         if(!stk1.isEmpty())
	  {
	      
	   return stk1.peek();
	  }
 System.out.println("Empty Queue");
	  return -1;
    }
    
    public boolean isEmpty() {
        return stk1.empty();
    }

public static void main(String gg[])
{
QueueUsingTwoStack q=new QueueUsingTwoStack();
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