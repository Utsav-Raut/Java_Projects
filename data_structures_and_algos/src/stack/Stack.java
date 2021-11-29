// From Javabrains

package stack;

public class Stack {

	private int arr[];
	private int capacity;
	private int top;
	
	Stack(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item) {
		if(isFull())
			throw new RuntimeException("Stack is full");
		arr[++top] = item;
		System.out.println("The item was successfully pushed onto the stack.");
	}
	
	public int pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is empty");
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is empty");
		return arr[top];
	}
	
	public boolean isEmpty() {
		
		return this.top == -1;
	}
	
	public boolean isFull() {
		
		return (this.top == this.capacity-1);
	}
	
	public void show() {
		for(int i=0; i<capacity; i++)
			System.out.print(arr[i] + " ");
	}
	
	
}
