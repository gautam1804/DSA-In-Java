import java.util.* ;
import java.io.*; 
public class QueueUsingDeque {
	// Initialize your data structure.
	Deque<Integer> d;
	QueueUsingDeque() {
d=new LinkedList<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and false otherwise.
	public void add(int x) {
		// Write your code here.
		d.addLast(x);
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
	public int remove() {
		// Write your code here.
		if(d.isEmpty())
		{
			return -1;
		}
		int val=d.removeFirst();
		return val;

	}

	// Returns the topmost element of the stack. In case the stack is empty, it returns -1.
	public int peek() {
		// Write your code here.
		if(d.isEmpty())
		{
			return -1;
		}
		return d.getFirst();
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
QueueUsingDeque q=new QueueUsingDeque();
q.add(1);
q.add(2);
q.add(3);

while(!q.isEmpty())
{

System.out.print(q.peek()+" ");
q.remove();
}
}
}