import java.util.*;

public class PushAtBottom
{
public static Stack<Integer> pushAtBottom(Stack<Integer> s,int x)
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

public static void main(String gg[])
{
Stack<Integer> s=new Stack<>();
s.push(1);
s.push(2);
s.push(3);
pushAtBottom(s,4);
while(!s.empty())
{
System.out.println(s.pop());
}
}
}