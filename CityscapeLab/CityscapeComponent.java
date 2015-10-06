import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

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
        s1 = new Sun(-7.5*Math.abs(this.time-12)+90);
        s2 = new Sun(-7.5*Math.abs(this.time-6)+90);
        s3 = new Sun(-7.5*Math.abs(this.time-18)+90);
        m = new Moon(7.5*Math.abs(this.time-12)-90, moonPhase);
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
