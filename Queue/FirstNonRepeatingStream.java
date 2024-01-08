import java.util.*;
public class FirstNonRepeatingStream
{
public static String FirstNonRepeating(String stream)
    {
        // code here
        StringBuilder ans=new StringBuilder("");

		int freq[]=new int[26];

		Queue<Character> q=new LinkedList<>();

		for(int i=0;i<stream.length();i++)
		{
			char ch=stream.charAt(i);
			q.add(ch);
			freq[ch-'a']++;

			while(!q.isEmpty() && freq[q.peek()-'a']>1)//yha if use kiya tha bs freq wali condition k sath, or freq[q.peek()] likh rha th 
			{
				q.remove();
			}
			if(q.isEmpty())
			{
				ans.append('#');
			}
			else
			{
				ans.append(q.peek());//yaha pr ch append kr rha tha
			}
		}
		return ans.toString();
        
    }

public static void main(String gg[])
{
System.out.println(FirstNonRepeating("aabccxb"));
}
}