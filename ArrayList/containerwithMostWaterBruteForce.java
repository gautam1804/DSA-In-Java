import java.util.*;

class psp
{

//time complexity - O(n^2)
 public static int maxArea(ArrayList<Integer> height) {
        
        int waterArea=0;
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
        {
            int width=j-i;
            int heightForArea=Math.min(height.get(i),height.get(j));
            if(waterArea<(width*heightForArea))
            {
                waterArea=width*heightForArea;
            }
        }
        }
        
        return waterArea;
    }

public static void main(String gg[])
{
ArrayList<Integer> height=new ArrayList<>();
height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);

int Area=maxArea(height);
System.out.println("Maximum area will be : "+Area);

}
}