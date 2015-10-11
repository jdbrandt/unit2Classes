import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    double time;
   
    Sun s1;
    Sun s2;
    Sun s3;
    Building b;
    Car c;
    Background ba;
    
    CityscapeComponent(double time)
    {
        this.time = time;
        s1 = new Sun(15*time-90);
        s2 = new Sun(15*time);
        s3 = new Sun(15*time-180);
        b = new Building();
        c = new Car();
        ba = new Background();
    }
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //background MUST BE DRAWN FIRST
        ba.draw(g2); 
        s1.draw(g2);
        s2.draw(g2);
        s3.draw(g2);
        b.draw(g2);
        c.draw(g2);
       
    }
        
        
  
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        //animates the sun
        this.time+=.01;
        if (this.time>=24)
        {
            //infinite looping
            this.time=0;
        }
        s1 = new Sun(15*time-90);
        s2 = new Sun(15*time);
        s3 = new Sun(15*time-180);
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
