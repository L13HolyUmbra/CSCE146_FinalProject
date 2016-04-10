
public class temp {
//BFS (key)
	//Create a queue Q
	//create an arraylist N //holds nodes
	//temp = root
	//enqueue temp onto q
	//add temp to N
	//while (q is not empty) 
	//{
	//	temp=q.dequeue 
	//	if (temp = lkey)
	//	return temp
	//for (all children c in N) // from temp
	//{
	//add c to N
	//enqueue c to q
	//{
	//}
	//return nothing
	
	
	//			a
	//		b		c
	//	d		e f		g
	//		  h		
	
	//used linked list class to create queue --> first in first out
	//queue: [a] --> [ ] --> [b][c] --> [c][ ] -->[c][d][e] --> [d][e] --> [d][e][f][g] --> [e][f][g] --> [e][f][g][h]
	//N= {a, b, c, d , e, f, g, h //what have you visited??? 
	
	//queue is a linked list
	// LList.java     IList.Java <-- general linked list 
	//Queue.java    --> IQueue.java
	//queue means that root always gets removed first
	//dequeue makes b the new root of the linked list
	
	//bstNode.java, Ibstnode.java
	//bst.java   Ibst.java 
	//record.java Irecord.java 
	//private val = 0; 
	//set
	//get
	
	//take queue, put into temp llist, add new value by making enqueue = to tail, iterate through temp list to make the new queue 
	
	//extra credit!
	//delete a node based on the content of that node
	//children to the right move up what if right has children? 
	//
	
}
