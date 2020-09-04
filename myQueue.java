package LinearDataStructure;
public class myQueue {
	
	class  Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}	

	Node head, rear;
	
	public void enqueue(int d)
	{
		
		Node toAdd =  new Node(d);
		
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		
		rear.next =  toAdd;
		rear = rear.next;
		
		
	}
	
	public int dequeue()
	{
		if(head == null) {
			return -1;
		}
		Node temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		return temp.data;

	}
	
	public int peek()
	{
		if(head == null) {
			return -1;
		}
		return head.data;
	}
	

}
