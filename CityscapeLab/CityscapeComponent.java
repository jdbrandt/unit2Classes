import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

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
    Moon m;
    Building b;
    
    
    
    
    CityscapeComponent()
    {
        this.time = 0;
    }
    
    CityscapeComponent(double time, String moonPhase)
    {
        this.time = time;
        s1 = new Sun(15*time-90);
        s2 = new Sun(15*time);
        s3 = new Sun(15*time-180);
        m = new Moon(15*time-270, moonPhase);
        b = new Building(100 ,-100 , 15);
    }
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        
        s1.draw(g2);
        s2.draw(g2);
        s3.draw(g2);
        
    }
        
        
  
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
