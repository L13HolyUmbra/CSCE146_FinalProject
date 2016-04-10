/*
 * QNode.java
 * Dion de Jong 5/02/2014
 * Ver: 1.00
 * Description: This is the QNode class that creates nodes used
 * in the Queue data structure
 */

public class QNode {
	
	//private variables used by the Node to create the queue
	private BTNode m_data;      // data portion
	private QNode  m_next;      // link to next node

	//constructor for a single node or the tail
	//keep in mind that my qnodes take in BTNodes in order to make the code work!
	public QNode(BTNode dataPortion)
	{
		m_next = null; 
		m_data = dataPortion; 
	} // end constructor

	//constructor for a node that establishes the data value and the next node 
	public QNode(BTNode dataPortion, QNode nextNode)
	{
		this.m_next = nextNode;
		this.m_data = dataPortion; 
	} // end constructor

	//getters and setters
	public void setNext(QNode next)
	{
		this.m_next = next; 
	}
	
	public QNode getNext()
	{
		return m_next; 
	}
	
	public BTNode getData()
	{
		return m_data; 
	}
	
	public void setData(BTNode data)
	{
		this.m_data = data; 
	}

//	public static void main(String[] args) {
//		QNode test = new QNode(5);
//		System.out.println(test.getData()); 
//	}
}