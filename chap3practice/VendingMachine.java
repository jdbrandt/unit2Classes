

/**
 * Basic vending machines, keeps track of amount of tokens and cans
 * 
 * @Brandt
 * @0.0
 */
public class VendingMachine
{
    /** amounts of cans in machine */
    private int cans;
    /** amount of tokens in machine */
    private int tokens;
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
        cans = 0;
        tokens = 0;
    }
    public VendingMachine(int cans)
    {
        this.cans = cans;
        tokens = 0;
    }

    /**
     * Fills up the vending machines with cans
     *
     * @pre        this.cans >= 0, cans > 0
     * @post    this.cans >= cans
     * @param    cans    amount of cans to insert into the vending machine
     */
    public void fillUp(int cans)
    {
        // put your code here
        this.cans += cans;
    }
    

    /**
     * Removes 1 can from vending machine
     *
     * @pre     this.cans > 0
     * @post    this.cans >= 0
     */
    public void insertToken()
    {
        this.cans-=1;
        this.tokens+=1;
    }
    
    /**
     * @return  the value of this.cans
     */
    public int getCans()
    {
        return this.cans;
    }
    
    /**
     * @return  the value of this.tokens
     */
    public int getTokens()
    {
        return this.tokens;
    }
    
    

    

}
