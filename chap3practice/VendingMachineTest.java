

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine v1 = new VendingMachine();
        v1.fillUp(50);
        assertEquals(50, v1.getCans());
        VendingMachine v2 = new VendingMachine(50);
        v2.fillUp(100);
        assertEquals(150, v2.getCans());
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine v1 = new VendingMachine();
        v1.fillUp(50);
        v1.insertToken();
        assertEquals(49, v1.getCans());
        assertEquals(1, v1.getTokens());
    }

}
