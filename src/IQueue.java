/**
 * Generic queue interface. 
 * @author Arjang Fahim
 * @date 1/10/2013
 * @version 1.0.0
 */

public interface IQueue  {
	
	//Add a new item onto the Queue
	public boolean enqueue(QNode O);
	//Remove an item from the Queue (FIFO)
	public QNode dequeue();
	//Return the size of the Queue (The number of items in the Queue)
	public int getSize();
	//Checks if a Queue is empty
	public boolean isEmpty();
	// prints the content of the queue
	public void printQueue();
}