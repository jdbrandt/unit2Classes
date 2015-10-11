import javax.swing.JFrame;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // changed to make it loop better
    static final int ANIMATION_TIME_IN_SECONDS = 10000;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        System.out.print('\u000C'); 
        
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hour (in 24 hour time): ");
        double time = s.nextDouble();
        System.out.print("Enter the minutes of the hour: ");
        time+=s.nextDouble()/60d;       
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(time);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);

        
        // animate the cityscape
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            //makes it loop much more seamlessly
            Thread.sleep(10);
        }
        
        
    }

}
