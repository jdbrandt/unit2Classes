import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class representing the moon in the cityscape
 * 
 * @Brandt
 * @0.0
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    // X value of moon instance
    private double x;
    // Y value of moon instance
    private double y;
    // Center angle value of moon instance
    private double theta;
    // Shape of moon instance: "new", "waxcresc", "q1", "waxgibb", "full", "wangibb", "q3", "wancresc"
    private String phase;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon()
    {
        this.theta = 0;
        this.x = 100*Math.cos(this.getTheta());
        this.y = -100*Math.sin(this.getTheta());

    }
    
    public Moon(double theta, String phase)
    {
        this.theta = theta;
        this.x = 100*Math.cos(theta);
        this.y = -100*Math.sin(theta);
        this.phase = phase;
    }

    /**
     * Accessor method for theta
     * @pre 0<=theta<=90
     * @post 0<=theta<=90
     * @return    this.theta
     */
    public double getTheta()
    {
        // put your code here
        return this.theta;
    }
    

    /**
     * Accessor method for x
     * @pre x>=0
     * @post x>=0
     * @return    this.x
     */
    public double getX()
    {
        // put your code here
        return this.x;
    }
    
    /**
     * Accessor method for y
     * @pre 0>=y
     * @post 0>=y
     * @return    this.y
     */
    public double getY()
    {
        // put your code here
        return this.y;
    }
    /**
     * Accessor method for phase
     * @return this.phase
     */
    public String getPhase()
    {
        return this.phase;
    }
    /**
     * Mutator method for theta, also sets x and y dependant upon theta
     * @post 0<=theta<=90, 0>=y, x>=0
     * @param theta Value to set this.theta equal to, and to calculate new x and y
     */
    public void setTheta(double theta)
    {
        // put your code here
        this.theta = theta;
        this.setX(this.theta);
        this.setY(this.theta);
    }
    
    /**
     * Mutator method for x, given theta
     * @post x>=0
     * @param theta value to calculate new x
     */
    public void setX(double theta)
    {
        this.x = 100*Math.cos(theta);
    }
    /**
     * Mutator method for y, given theta
     * @post y<=0
     * @param theta value to calculate new y with
     */
    public void setY(double theta)
    {
        this.y = -100*Math.sin(theta);
    }
    /**
     * Mutator method for phase, given phase
     * @param phase new phase
     */
    public void setPhase(String phase)
    {
        this.phase = phase;
    }
    


}


