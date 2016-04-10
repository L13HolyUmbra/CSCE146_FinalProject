
public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You don't have to have printQueue method. But such a
		//method will be helpful to test your queue

		//test the Queue and shows how to enqueue data in my code
		//		Data a = new Data(10);
		//		BTNode aBT = new BTNode(a);
		//		QNode aQ = new QNode(aBT); 
		//		
		//		Data b = new Data(4);
		//		BTNode bBT = new BTNode(b);
		//		QNode bQ = new QNode(bBT); 
		//		
		//		Data c = new Data(24);
		//		BTNode cBT = new BTNode(c);
		//		QNode cQ = new QNode(cBT); 
		//		
		//		Data d = new Data(78);
		//		BTNode dBT = new BTNode(d);
		//		QNode dQ = new QNode(dBT); 
		//
		//		Queue q = new Queue();
		//		q.enqueue(aQ);
		//
		//		q.printQueue();
		//		q.dequeue();
		//		q.printQueue();

		//Testing BST
		//		BST bst = new BST();
		//		Data a = new Data(13);
		//		Data b = new Data(9);
		//		Data c = new Data(11);
		//		Data d = new Data(4);
		//		Data e = new Data(1);
		//		Data f = new Data(7);
		//		Data g = new Data(16);
		//		Data h = new Data(14);
		//		Data i = new Data(20);
		//		Data j = new Data(18);
		//		Data k = new Data(23);
		//		bst.insert(a); 
		//		bst.insert(b); 
		//		bst.insert(c); 
		//		bst.insert(d); 
		//		bst.insert(e); 
		//		bst.insert(f); 
		//		bst.insert(g); 
		//		bst.insert(h); 
		//		bst.insert(i); 
		//		bst.insert(j); 
		//		bst.insert(k); 
		//		System.out.println(bst.getRoot().getData().getVal());
		//		System.out.println(bst.toStringInorder(null));


		// Set 1
//		BST bst = new BST();
//		Data d;	        
//		int[] data = {10, 2, 4, 5, 89, 34, 32};
//
//		for (int i = 0; i< data.length; i++)
//		{
//			d = new Data(data[i]);
//			bst.insert(d);
//		}                       
//
//	//	System.out.println(bst.toStringInorder(null));
//
//
//
//		d = new Data(34);
//		bst.BFS(d);  	
		


		// Set 2: this one should through an error because we have a 
		// repeating item
		Data d;	        
                int[] data = {10, 2, 4, 4, 89, 34, 32};
                BST bst = new BST();
                for (int i = 0; i< data.length; i++)
                {
		   d = new Data(data[i]);
                   bst.insert(d);

                } 


		// Set 3:
//		 Data d;	        
//                int[] data = {10, -3, -6, 5, 11, 23, -19};
//                BST bst = new BST();
//
//                for (int i = 0; i< data.length; i++)
//                {
//		   d = new Data(data[i]);
//                   bst.insert(d);
//
//                }                       
//
//
                d = new Data(34);
                bst.BFS(d);  	           
		            

	}

}