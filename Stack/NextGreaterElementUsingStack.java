import java.util.*;

public class NextGreaterElementUsingStack
{

public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] nextgreater=new int[n];
        Stack<Integer> s=new Stack<>();

        for(int i=n-1;i>=0;i--)
        {

        while(!s.empty() && arr[s.peek()]<=arr[i])// stack me element nhi index stored he isliye ye yad rkho
        {
            s.pop();
            
        }

        if(s.empty())
        {
            nextgreater[i]=-1;
        }
        else
        {
            nextgreater[i]=arr[s.peek()];// stack me element nhi index stored he isliye ye yad rkho
        }

        s.push(i);
        
        }
        

        return nextgreater;
    }


public static void main(String gg[])
{
int arr[]={7, 12, 1, 20};
int nextGreater[]=nextGreaterElement(arr, arr.length);

for(int i=0;i<nextGreater.length;i++)
{
System.out.print(nextGreater[i]+" ");
}

}

}