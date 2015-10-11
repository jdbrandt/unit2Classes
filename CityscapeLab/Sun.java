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
     * Accessor method for sun for drawing
     * @return this.sun
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(0, 510, 50, 50);
        //rotates around ~center due to the problem with framing
        g2.rotate(this.theta, 325, 525);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
        //unrotates the g2 object to prepare for more drawing
        g2.rotate(-this.theta, 325, 525);
    }
    


}
