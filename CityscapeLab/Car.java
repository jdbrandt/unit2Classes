import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

/**
 * Draws a non-customizable car upon a cityscape
 * 
 * @Brandt
 * @0.0
 */
public class Car
{

    /**
     * Default constructor for objects of class Car
     */
    public Car()
    {}


    /**
     * Draws the Car upon the city scape
     *
     * @pre        A frame upon which to draw the car
     * @post    A car drawn
     * @param    g2    GraphicsG2 object
     */
    public void draw(Graphics2D g2)
    {
        Rectangle car = new Rectangle(100, 450, 50, 20);
        g2.setColor(Color.RED);
        g2.draw(car);
        g2.fill(car);
        
        Ellipse2D.Double wheel1 = new Ellipse2D.Double(105, 470, 10, 10);
        Ellipse2D.Double wheel2 = new Ellipse2D.Double(130, 470, 10, 10);
        g2.setColor(Color.BLACK);
        g2.draw(wheel1);
        g2.fill(wheel1);
        g2.draw(wheel2);
        g2.fill(wheel2);
        
        
    }
}

        