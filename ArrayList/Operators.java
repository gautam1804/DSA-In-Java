import java.util.ArrayList;

class psp
{
public static void main(String gg[])
{
ArrayList<Integer> list1=new ArrayList<>();
ArrayList<String> list2=new ArrayList<>();
ArrayList<Boolean> list3=new ArrayList<>();

//size operator
System.out.println(list1.size());

//add operator O(1) complexity

list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
list1.add(5);

System.out.println(list1);
System.out.println(list1.size());


//get operator O(1)

System.out.println(list1.get(0));
System.out.println(list1.get(3));

//remove operator O(n)

list1.remove(2);//index 2 value deleted
System.out.println(list1);

//set operator O(n) yad rkh
list1.set(0,111);
System.out.println(list1);

//contains operator O(n)

System.out.println(list1.contains(1));
System.out.println(list1.contains(111));


//special add operator O(n)
list1.add(2,333); //put value at 2 index.

//different travesal
for(int i=0;i<list1.size();i++)
{
System.out.print(list1.get(i)+" "); //print only not ln
}
}
}