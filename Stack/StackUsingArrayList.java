import java.util.ArrayList;

public class StackUsingArrayList
{
static class Stack
{
static ArrayList<Integer> list=new ArrayList<>();

public static boolean isEmpty()
{
return list.size()==0; //return true if size is 0;
}

public static void push(int data)
{
list.add(data); // O(1) operation of ArrayList
}

public static int pop()
{
//special case 
if(isEmpty()) return -1;

int top=list.get(list.size()-1); //O(1) operation of ArrayList
list.remove(list.size()-1);//O(1) operation of ArrayList
return top;
}

public static int peek()
{
if(isEmpty()) return -1;
return list.get(list.size()-1);
}
}


public static void main(String gg[])
{
Stack s=new Stack();
//s.push(1);
//s.push(2);
//s.push(3);
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
while(!s.isEmpty())
{
System.out.println(s.peek());
s.pop();
}
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
}
}