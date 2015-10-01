import java.util.*;

public class TelephoneConverter
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a telephone number in the form of 5555555555:");
        
        String num = s.next();
        String area = "("+num.substring(0,3)+") ";
        String first = num.substring(3,6);
        String second = "-"+num.substring(6,10);
        System.out.println(area+first+second);
    }
}