import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class representing the Sun in the Cityscape
 * 
 * @Brandt
 * @0.0
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    
    // X value of sun instance
    private double x;
    // Y value of sun instance
    private double y;
    // Center angle measure of sun instance
    
    private double theta;
    // Actual representation of Sun passed in radians
    

    /**
     * Default constructor for objects of class Sun
     */
    public Sun()
    {
        this.theta = 0;
        
        this.x = 300*Math.cos(this.getTheta());
        this.y = 800-(300*Math.sin(this.getTheta())+200);
        
    }
    
    //Theta must be in radians
    public Sun(double theta)
    {
        this.theta = theta;
        
        this.x = 300*Math.cos(theta);
        this.y = 800-(300*Math.sin(theta)+200);
        
       
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
     * @param theta value to calculate new x0
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
     * Accessor method for sun for drawing
     * @return this.sun
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(0, 510, 50, 50);
        g2.rotate(90, 0, 510);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
    }
    


}
