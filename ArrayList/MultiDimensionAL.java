import java.util.*;

class psp
{
public static void main(String gg[])
{
ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
ArrayList<Integer> list1=new ArrayList<>();

list1.add(100);
list1.add(22);
list1.add(8);
list1.add(4);
list1.add(51);
System.out.println(list1);

ArrayList<Integer> list2=new ArrayList<>();

list2.add(1);
list2.add(2);
list2.add(3);
list2.add(4);
list2.add(5);
System.out.println(list2);
list2.remove(2);

ArrayList<Integer> list3=new ArrayList<>();

list3.add(3);
list3.add(6);
list3.add(9);
list3.add(12);
list3.add(15);
System.out.println(list3);

mainList.add(list1);
mainList.add(list2);
mainList.add(list3);
System.out.println(mainList);

//accessing using nested loop

for(int i=0;i<mainList.size();i++)
{
ArrayList<Integer> currentlist=mainList.get(i);
for(int j=0;j<currentlist.size();j++)
{
System.out.print(currentlist.get(j)+" ");
}
System.out.println();
}
}
}