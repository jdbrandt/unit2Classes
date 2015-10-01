public class DistanceConverter
{
    public static final int YTF = 3;
    public static final int FTI = 12;
   public static void main(String[] args)
   {
      double yards = 3.5;
      
      System.out.println(yards + "yards are " + yards*YTF + " feet");
      System.out.println(yards + "yards are " + yards*YTF*FTI + " inches");
   }
}