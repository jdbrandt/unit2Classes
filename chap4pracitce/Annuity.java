public class Annuity
{
    public static void main(String[] args)
    {
        double i = .08;
        double n = 20;
        int pmt = 10000;
        
        double ann =  pmt*((((Math.pow((1+i),(n-1)))-1)/i)/Math.pow((1+i),(n-1))+1);
        System.out.println(ann);
        
        
    }
    
    public static void alt(String[] args)
    {
        double i = .08;
        double n = 20;
        int pmt = 10000;
        
        double base = 1+i;
        double exp = n-1;
        
        double ann = pmt*(((Math.pow(base,exp)-1)/i)/Math.pow(base, exp)+1);
        System.out.println(ann);
    }
}
        
        