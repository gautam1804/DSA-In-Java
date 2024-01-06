import java.util.*;

public class StockSpanProblem
{

public static void stockSpan(int stocks[],int span[])
{
span[0]=1;
Stack<Integer> s=new Stack<>();
s.push(0);
        
for(int i=1;i<stocks.length;i++)
{
int currPrice=stocks[i];
            
while(!s.empty() && currPrice>=stocks[s.peek()]) //sabse badi glti jisse testcases fail hue the currPrice>stocks[s.peek()] only > not >=. But >= is correct.
{
s.pop();
}
if(s.empty())
{
span[i]=i+1;
}
else
{
int prevHigh=s.peek();
span[i]=i-prevHigh;
}
            
s.push(i);
}
}


public static void main(String gg[])
{
int stocks[]={100,80,60,70,60,85,100};
int span[]=new int[stocks.length];

stockSpan(stocks,span);

for(int i=0;i<span.length;i++)
{
System.out.print(span[i]+" ");
}

}

}