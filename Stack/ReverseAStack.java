import java.util.*;

public class ReverseAStack
{
public static Stack<Integer> pushAtBottom(Stack<Integer> s,int x) //helper
{
if(s.empty())
{
s.push(x);
return s;
}

int lastVal=s.pop();
pushAtBottom(s,x);
s.push(lastVal);
return s;
}

public static void reverse(Stack<Integer> s)
{
if(s.empty()) return;

int l=s.pop();
reverse(s);
pushAtBottom(s,l);

}

public static void main(String gg[])
{
Stack<Integer> s=new Stack<>();
s.push(1);
s.push(2);
s.push(3);



reverse(s);
System.out.println("After reverse:  ");
while(!s.empty())
{
System.out.println(s.pop());
}
}
}