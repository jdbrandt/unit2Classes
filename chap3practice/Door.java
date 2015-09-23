

/**
 * Java object which describes the actions of a door
 * 
 * @author Brandt
 * @version 0.0
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private boolean closed;
    //Checks whether door is open or closed
    private boolean locked;
    //Checks wheter door is locked or unlocked
    private int keyval;
    //Value of the key to unlock the door
    private String type;
    //type of door: front, side, etc.
    
    
    

    /**
     * Default constructor for objects of class Door
     */
    public Door()
    {
        // initialise instance variables
        this.closed = false;
        this.locked = false;
        this.keyval = 0;
        this.type = "";
    }
    public Door(boolean closed, boolean locked, int keyval, String type)
    {
        this.closed = closed;
        this.locked = locked;
        this.keyval = keyval;
        this.type = type;
    }
    /**
     * Opens the door
     *
     * @pre        Door has been closed, door is not locked
     * @post    Door will be open
     * @param    y    description of parameter y
     */
    public void open()
    {
        closed = false;
    }
    

    /**
     * Opens a locked door
     *
     * @pre     Door has been closed and locked
     * @post    Door will be open if correct key is supplied. If incorrect key is supplied, door will remain closed
     *          (what the method guarantees upon completion)
     * @param   key   The value the user supplies as a key
     */
    public void open(int key)
    {
        if (key==keyval)
        {
            this.closed = false;
        }
    }
    

    /**
     * Closes a door
     *
     * @pre     Door is open
     * @post    Door is closed
     */
    public void close()
    {
        this.closed = true;    
    }

    /**
     * Locks a door
     *
     * @pre     Door is closed and unlocked
     * @post    Door is closed and locked
     * @param   key   Users guess at keyval
     */
    public void lock(int key)
    {
        // put your code here
        if (key==keyval)
        {
            this.locked=true;
        }
    }
    

    /**
     * Check if open or closed
     * @return  bool equal to closed
     */
    public boolean getClosed()
    {
        // put your code here
        return this.closed;
    }
    /**
     * Check if locked or unlocked
     * @return  bool equal to locked
     */
    public boolean getLocked()
    {
        // put your code here
        return this.locked;
    }
    /**
     * Return type
     * @return  String of type
     */
    public String getType()
    {
        // put your code here
        return this.type;
    }
    


}
