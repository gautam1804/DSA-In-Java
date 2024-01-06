import java.util.ArrayList;
class psp
{
public static void main(String [] gg)
{
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3000);
list.add(4);
list.add(5);

//find maximum O(n)

int max=Integer.MIN_VALUE; //yad rkh -infinity hota he ye


for(int i=0;i<list.size();i++)
{
//if(list.get(i)>max) max=list.get(i);

//same
max=Math.max(max,list.get(i));
}

System.out.println("Largest element : "+max);

}
}