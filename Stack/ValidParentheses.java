import java.util.*;

public class ValidParentheses
{

//Time complexity is O(N) because single loop means O(N) and single push & pop i.e. only one time means they are of O(1)
public static boolean isValidParenthesis(String s) {

Stack<Character> st=new Stack<>();
    
         int i=0;
        for(;i<s.length();i++)
        {
            char b=s.charAt(i);
            if(b=='('||b=='{'||b=='[')
            {
            st.push(b);
            }
            else
            {
                if(st.isEmpty())
                {
                return false;
                }

                if((st.peek()=='(' && b==')') || (st.peek()=='{' && b=='}') || (st.peek()=='[' && b==']'))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
}


public static void main(String gg[])
{
String paren="(){}[{}({})]";
System.out.println(isValidParenthesis(paren));

}

}