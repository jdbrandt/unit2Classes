import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;


/**
 * Draws a non-customizable building upon a cityscape
 * 
 * @Brandt
 * @0.0
 */
public class Building
{

    /**
     * Default constructor for objects of class Building
     */
    public Building()
    {}


    /**
     * Draws the Building upon the city scape
     *
     * @pre        A frame upon which to draw the building
     * @post    A building drawn
     * @param    g2    GraphicsG2 object
     */
    public void draw(Graphics2D g2)
    {
        //constructs the main back lighting for the building
        Rectangle bmain = new Rectangle(250, 250, 200, 200);
        g2.setColor(Color.YELLOW);
        g2.draw(bmain);
        g2.fill(bmain);
        
        
        //creates the main horizontal lines
        Rectangle b1 = new Rectangle(250, 250, 200, 25);
        Rectangle b2 = new Rectangle(250, 300, 200, 25);
        Rectangle b3 = new Rectangle(250, 350, 200, 25);
        Rectangle b4 = new Rectangle(250, 400, 200, 25);
        Rectangle b5 = new Rectangle(250, 450, 225, 25);
        g2.setColor(Color.BLACK);
        g2.draw(b1);
        g2.fill(b1);
        g2.draw(b2);
        g2.fill(b2);
        g2.draw(b3);
        g2.fill(b3);
        g2.draw(b4);
        g2.fill(b4);
        g2.draw(b5);
        g2.fill(b5);
        
        //creates the main vertical lines
        Rectangle b6 = new Rectangle(250, 250, 25, 200);
        Rectangle b7 = new Rectangle(300, 250, 25, 200);
        Rectangle b8 = new Rectangle(350, 250, 25, 200);
        Rectangle b9 = new Rectangle(400, 250, 25, 200);
        Rectangle b10 = new Rectangle(450, 250, 25, 200);
        g2.draw(b6);
        g2.fill(b6);
        g2.draw(b7);
        g2.fill(b7);
        g2.draw(b8);
        g2.fill(b8);
        g2.draw(b9);
        g2.fill(b9);
        g2.draw(b10);
        g2.fill(b10);
    }

}
