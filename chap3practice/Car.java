

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. The car can be
 * driven a certain distance
 * 
 * @author Brandt
 * @version 0.0
 */
public class Car
{
    /** fuel efficiency of the car in mpg */
    private double fuelEfficiency;
    
    /** amount of fuel in the tank of the car, in gallons*/
    private double fuelInTank;

    /**
     * Constructor for objects of class Car which specify the fuel efficienciy
     */
    public Car( double fuelEfficiency )
    {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
        // initialise instance variables
        
    }

    /**
     *Simulates drivng the car the specified distancce and reduces the amount of fuel in the tank
     *according to efficiency
     *
     * @pre        specified distance annot result in the consumption of more gas than is available
     * in the tank
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    distance    distance that the car drives in miles
   
     */
    public void drive(double distance)
    {
       fuelInTank -= distance/fuelEfficiency;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
    
     * @return  Returns amt of gas in tank, in gallons
     */
    public double getGasInTank()
    {
        // put your code here
        return fuelInTank;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     gallonsOfGas must be greater than or equal to 0
     *
     * @param   gallonsOfGas   amount of gas to add to the car's tank
     */
    public void addGas(double gallonsOfGas)
    {
        // put your code here
        fuelInTank += gallonsOfGas;
    }


}
