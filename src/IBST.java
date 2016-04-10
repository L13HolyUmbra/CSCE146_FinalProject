public interface IBST<T>
{

  // returns the Height of the tree	
  public int getMaxHeight();

  // counts/ keep the number of the nodes 	
  public int getNodeCount();

  // returns the root node
  public BTNode<T> getRoot();


  //inserts a new record/item in tree and returns corresponding 
  //node
  public BTNode<T> insert(Data d);

  // checks if BST is empty
  public boolean isEmpty();

  // traverse BST using  Inorder algorithm 
  public String toStringInorder(BTNode<T> v);

  // traverse BST using  Preorder algorithm
  public String toStringPreorder(BTNode<T> v);

  // traverse BST using  Postorder algorithm
  public String toStringPostorder(BTNode<T> v);

  //use BFS algorithm to check if d is in the BST.
  public boolean BFS(Data d);

} // public interface IBT