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
    
    // Center angle measure of sun instance
    private double theta;
   
    
    //Theta must be in degrees
    public Sun(double theta)
    {
        this.theta = Math.toRadians(theta);
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
     * Mutator method for theta
     * @post 0<=theta<=90,
     * @param theta Value to set this.theta equal to
     */
    public void setTheta(double theta)
    {
        // put your code here
        this.theta = theta;
    }

    
    /**
     * Accessor method for sun for drawing
     * @return this.sun
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(0, 510, 50, 50);
        g2.rotate(this.theta, 325, 525);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
        g2.rotate(-this.theta, 325, 525);
    }
    


}
