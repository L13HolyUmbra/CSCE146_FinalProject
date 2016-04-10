import java.util.ArrayList;

/*
 * BTNode.java
 * Dion de Jong 4/02/2014
 * Ver: 1.00
 * Description: This is the Queue class. It defines Queue data structure 
 * using the Queue nodes.  
 * Last modified: 4/02/14
 */

public class Queue implements IQueue {

	//private variables to maintain the structure
	private QNode head;
	private QNode tail;
	private int size; 
	private ArrayList<QNode> myList = new ArrayList<QNode>();

	//default constructor
	public Queue()
	{
		this.head = null; 
		this.tail = null; 
		this.size = 0; 
	}

	//
	@Override
	//the enqueue method to add an item to the queue
	public boolean enqueue(QNode Q) 
	{
		//if the queue is empty
		if (isEmpty())
		{
			//the tail and head equal the enqueued item
			tail = Q;
			head = Q;
			//size is = to one
			size = 1; 
			//must print queue whenever the an item is enqueued 
			printQueue();
			return true;
		}

		else
		{
			//if there is one or more nodes, different rules apply. 
			//attach it to the previous last node
			tail.setNext(Q);
			//the new last node is the input
			tail = Q; 
			//increment size
			size++; 
			//must print queue whenever the an item is enqueued
			printQueue();
			return true;
		}
	}

	@Override
	public QNode dequeue() 
	{
		//the item that is dequeued must be returned
		QNode ReturnNode = head; 		

		//if the queue is empty
		if (tail == null)
		{
			//print message
			System.out.println("There is nothing to dequeue.");
		}

		//what happens if the queue is size one. 
		else if (tail == head)
		{
			//clear everything
			head = null;
			tail = null;
			myList.clear();
		}

		else 
		{
			//otherwise remember the FIFI rule
			//save a temp that is the second item in the queue
			QNode tempNode = head.getNext(); 
			//make that the new head
			head = tempNode; 
			//decrement the size
			size --; 
		}
		//print the queue and the dequeued node
		printQueue(); 
		return ReturnNode; 
	}

	//getter for size
	@Override
	public int getSize() 	
	{
		return this.size; 
	}

	
	//if the tail is null the list is empty
	@Override
	public boolean isEmpty() 
	{
		if (tail == null) 
		{
			return true; 
		}
		else
			return false; 
	}

	
	//the print queue method that prints the current structure queued together
	@Override         
	public void printQueue()
	{
		//if there is nothing
		if (isEmpty())
		{
			//print message
			System.out.println("The Queue is now empty");
		}
		else
		{
			//save temp for while loop that starts at head
			QNode temp = head; 
			//while the value is not null print
			while (temp != null)
			{
				//print the current nodes value and get the next node in the queue as the temp
				System.out.print(temp.getData().getData().getVal() + ", ");
				temp = temp.getNext(); 
			}
			//print a space
				System.out.println();
		}
	}

	
//	//test the queue
//	public static void main(String[] args) 
//	{
//		Queue test = new Queue();
//		//System.out.println(test.isEmpty()); 
//		Data five = new Data(5);
//		BTNode fiveN = new BTNode(five);
//		QNode FiveQ = new QNode(fiveN);
//		test.enqueue(FiveQ);
//		Data a = new Data(8);
//		BTNode aN = new BTNode(a);
//		QNode aQ = new QNode(aN);
//		test.enqueue(aQ); 
//		Data b = new Data(2);
//		BTNode bN = new BTNode(b);
//		QNode bQ = new QNode(bN);
//		test.enqueue(bQ); 
//	//	System.out.println(test.isEmpty()); 
//		//		test.enqueue(9);
//		//		test.enqueue(4);
//		//		test.enqueue(11);
//		//int tempInt = test.dequeue().getVal(); 
//		//System.out.println(test.getSize()); 
//		//System.out.println(test.getHead().getData().getData().getVal()); 
//		//	test.printQueue();
//		System.out.println(test.dequeue().getData().getData().getVal());
//		//System.out.println(test.isEmpty()); 
//		//test.printQueue();
		//		Data blah = new Data(5); 
		//		System.out.println(blah.getVal());
	}
