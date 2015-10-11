import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    /**
     * Constructor for objects of class Background
     */
    public Background()
    {}

    /**
     * Draws the background for the cityscape
     * 
     * @param  g2   Graphics2D object 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle background = new Rectangle(0, 0, 800, 600);
        g2.setColor(Color.BLUE);
        g2.draw(background);
        g2.fill(background);
    }
}
