import java.util.*;
class psp
{
public static void swap(ArrayList<Integer> list,int in1,int in2)
{
int temp=list.get(in1);
list.set(in1,list.get(in2));
list.set(in2,temp);
}

public static void main(String [] gg)
{
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3000);
list.add(4);
list.add(5);

//swap two numbers O(n)

Scanner sc=new Scanner(System.in);
System.out.println("Enter the two indexes: ");
int in1=sc.nextInt();
int in2=sc.nextInt();

swap(list,in1,in2);

System.out.println(list);

}
}