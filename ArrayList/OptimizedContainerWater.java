import java.util.*;

class psp
{

//time complexity - O(n)
 public static int maxArea(ArrayList<Integer> height) {
        
       int left=0;
        int right=height.size()-1;
        int maxArea=0;
        while(left<right)
        {
        int heightForArea=Math.min(height.get(left),height.get(right));
        int width=right-left;
        int waterArea=(heightForArea*width);
        maxArea=Math.max(waterArea,maxArea);
            
        if(height.get(left)<height.get(right))
        {
            left++;
        }
        else
        {
            right--;
        }
        }
       
      
        return maxArea;
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