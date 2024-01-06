import java.util.*;

class psp
{
public static void main(String gg[])
{
ArrayList<Integer> list1=new ArrayList<>();

list1.add(100);
list1.add(22);
list1.add(8);
list1.add(4);
list1.add(51);

//sort in ascending order
Collections.sort(list1);
System.out.println(list1);
//.sort is optimized function which take care of the complexity.

//sort in descending order //yad rkh
Collections.sort(list1,Collections.reverseOrder());
System.out.println(list1);

//Collections.reverseOrder()- a comparator, a function who decides the logic of sorting.
}
}