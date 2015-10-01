import java.util.*;

public class Cashier
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of money in pennies that is to delivered in change: ");
        int in = s.nextInt();
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        while (in>=100)
        {
            in-=100;
            dollars+=1;
        };
        while (in>=25)
        {
            in-=25;
            quarters+=1;
        };
        while (in>=10)
        {
            in-=10;
            dimes+=1;
        };
        while (in>=5)
        {
            in-=5;
            nickels+=1;
        };
        while (in>0)
        {
            in-=1;
            pennies+=1;
        };
        
        System.out.print("Hand back ");
        System.out.print(dollars+" dollars, ");
        System.out.print(quarters+" quarters, ");
        System.out.print(dimes+" dimes, ");
        System.out.print(nickels+" nickels, ");
        System.out.print("and "+pennies+" pennies. ");
    }
    
    public static void alt(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of money in pennies that is to delivered in change: ");
        int in = s.nextInt();
        int dollars = in/100;
        int quarters = (in%100)/25;
        in-=quarters*25;
        int dimes = (in%100)/10;
        int nickels = (in%10)/5;
        int pennies = (in%5);
        
        System.out.print("Hand back ");
        System.out.print(dollars+" dollars, ");
        System.out.print(quarters+" quarters, ");
        System.out.print(dimes+" dimes, ");
        System.out.print(nickels+" nickels, ");
        System.out.print("and "+pennies+" pennies. ");
    }
}

            