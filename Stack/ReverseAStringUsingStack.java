import java.util.*;

public class ReverseAStringUsingStack
{

public static String reverseString(String str)
{
Stack<Character> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
s.push(str.charAt(i)); //yad rkho str[i] nhi likhte java me
}

StringBuilder result=new StringBuilder("");
while(!s.empty())
{
char t=s.pop();
result.append(t);  //append() function hota he StringBuilder me
}

return result.toString(); //toString() zaruri he 
}


public static void main(String gg[])
{
String str="abc";
System.out.println("reverse String is : "+reverseString(str));
}
}