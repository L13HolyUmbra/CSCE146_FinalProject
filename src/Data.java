/**
 * The class for holding the data portion of 
 * any data structure. 
 * LinkedList, Tree, Heap
 * @author Arjang Fahim
 * @date 3/1/2014
 * @version 1.00 
 */
public class Data 
{	
	private int pVal;
	
	//Constructor
    public Data(int value)
	{
    	setVal(value);
	}

    public void setVal(int value)
    {
    	pVal = value;
    }
    
    public int getVal()
    {
    	return pVal;
    }
    
}