package LinearDataStructure;

public class MyStack {
	
	static MyLinkedList ll = new MyLinkedList();
	
	public static void push(int data)
	{
		ll.Add(data);
	}
	
	public static int pop()
	{
		return ll.removeLast();
	}
	
	public static int peek()
	{
		return ll.getLast();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(peek());
		pop();
		System.out.println(peek());
		
		
		
		

	}

}
