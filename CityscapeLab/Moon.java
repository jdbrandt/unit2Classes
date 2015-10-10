import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class representing the moon in the cityscape
 * 
 * @Brandt
 * @0.0
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    // Center angle measure of sun instance
    private double theta;
    // Shape of moon instance: "new", "q1", "full", "q3"
    private String phase;
    
    
    public Moon(double theta, String phase)
    {
        this.theta = Math.toRadians(theta);

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
     * Accessor method for phase
     * @return this.phase
     */
    public String getPhase()
    {
        return this.phase;
    }
    
    /**
     * Mutator method for theta
     * @post 0<=theta<=90
     * @param theta Value to set this.theta equal to
     */
    public void setTheta(double theta)
    {
        // put your code here
        this.theta = theta;
    }

    /**
     * Mutator method for phase, given phase
     * @param phase new phase
     */
    public void setPhase(String phase)
    {
        this.phase = phase;
    }
    
    /**
     * Drawing method for moon, for use in component class. Draws the moon dependent upon the time of the day, and changes shape given the shape provided
     * @post A moon in the frame, although it may not be visible
     * @param Any Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        
        if (this.phase=="full")
        {
            Ellipse2D.Double moon = new Ellipse2D.Double(0, 510, 50, 50);
            g2.rotate(this.theta, 325, 525);
            g2.setColor(Color.GRAY);
            g2.draw(moon);
            g2.fill(moon);
            g2.rotate(-this.theta, 325, 525);
        }
        else if (this.phase=="q3")
        {
            Arc2D.Double moon = new Arc2D.Double(0, 510, 50, 50, 90, 90, Arc2D.CHORD);
            g2.rotate(this.theta, 325, 525);
            g2.setColor(Color.GRAY);
            g2.draw(moon);
            g2.fill(moon);
            g2.rotate(-this.theta, 325, 525);
        }
        

    }
    


}


