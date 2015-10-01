import java.util.*;


public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter the height: ");
        double height = s.nextDouble();
        
        System.out.print("Please enter the width: ");
        double width = s.nextDouble();
        
        System.out.println("The area of the rectangle is: "+height*width);
        System.out.println("The perimeter of the rectangle is: "+(2*height+2*width));
        System.out.println("The length of the diagonal is: "+(Math.sqrt(Math.pow(height, 2)+Math.pow(width,2))));
    }
}
