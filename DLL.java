package LinearDataStructure;

public class DLL {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int d)
		{
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head, prev;
	
	public void pushAtEnd(int d)
	{
		Node toAdd = new Node(d);
		
		toAdd.next = head;
		toAdd.prev = null;
		
		if(head != null)
			head.prev = toAdd;
		
		head = toAdd;
		

		}
	
}
