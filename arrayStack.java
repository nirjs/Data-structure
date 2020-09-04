package LinearDataStructure;

public class arrayStack {
	
	static int arr[] = new int[100];
	public static int top = -1;
	static void push(int x)
	{
		top++;
		arr[top] = x;
		
		
	}
	
	static int pop()
	{
		int temp = arr[top];
		top--;
		return temp;
		
	}
	
	static int top() 
	{
		 return arr[top];
	}
	
	

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		
		for(int i = 0; i < 6 ;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		System.out.println(pop());    // Popped 6
		System.out.println(top());    // 5 is at top of stack
		

	}

}
