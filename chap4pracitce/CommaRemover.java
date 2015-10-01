import java.util.*;

public class CommaRemover
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter an integer: ");
       System.out.println((s.next()).replace(",", ""));
       
}
}
       