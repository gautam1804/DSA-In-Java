import java.util.* ;
import java.io.*; 
public class StackUsingDeque {
	// Initialize your data structure.
	Deque<Integer> d;
	StackUsingDeque() {
d=new LinkedList<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and false otherwise.
	public void push(int x) {
		// Write your code here.
		d.addLast(x);
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
	public int pop() {
		// Write your code here.
		if(d.isEmpty())
		{
			return -1;
		}
		int val=d.removeLast();
		return val;

	}

	// Returns the topmost element of the stack. In case the stack is empty, it returns -1.
	public int peek() {
		// Write your code here.
		if(d.isEmpty())
		{
			return -1;
		}
		return d.getLast();
	}

	// Returns true if the stack is empty, otherwise false.
	public boolean isEmpty() {
		// Write your code here.
		return d.isEmpty();
	}

	// Returns the number of elements currently present in the stack.
	public int size() {
		// Write your code here.
		return d.size();
	}

public static void main(String gg[])
{
StackUsingDeque s=new StackUsingDeque();
s.push(1);
s.push(2);
s.push(3);

while(!s.isEmpty())
{

System.out.print(s.peek()+" ");
s.pop();
}
}
}