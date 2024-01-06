import java.util.*;

public class StackUsingJCF
{


public static void main(String gg[])
{
Stack<Integer> s=new Stack<>();
s.push(1);
s.push(2);
s.push(3);
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
while(!s.isEmpty())
{
System.out.println(s.peek());
s.pop();
}
System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
}
}