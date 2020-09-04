package LinearDataStructure;

public class MyLinkedList {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	Node head;
	
	public void Add(int data)
	
	{
		Node toAdd = new Node(data);
	
	
		if(head == null) {
			head = toAdd;
			return;
		}
		Node temp = head;
		
		while( temp.next != null){
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	
	public void print()
	{
		Node temp = head;
		while( temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public void delete(int pos)        // Head -> 1 -> 2 -> 3 -> 4 -> 5  Elements in list
	{								   //         0    1    2    3    4  Index  
		Node prev = head;
		Node Next = head;
		for(int i = 0; prev != null && i < pos-1 ;i++) {
			prev = prev.next;
			
		}
		Next = prev.next.next;
		
		prev.next = Next;
		
	
	}
	
	public void deleteByKey(int key)
	{
		Node Next = head;
		Node pre = null;
		while(Next.data != key) {
			pre = Next; 
			Next = Next.next;
		}
		pre.next = Next.next;
		
	}
	
	public int removeLast()
	{	
		Node temp = head;
		if(head == null) {
			System.out.println("List is Empty");
		}
		if(temp.next == null) {
			Node toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public int getLast() 
	{
		Node temp = head;
		if(temp == null) {
			System.out.println("List is Empty");
		}
		while(temp.next != null) {
			temp = temp.next;
			
		}
		return temp.data;
		
	}
	
}
