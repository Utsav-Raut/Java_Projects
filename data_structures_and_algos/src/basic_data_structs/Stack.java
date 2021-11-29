package basic_data_structs;

public class Stack {
	
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int item) {
		if (isFull()) {
			System.out.println("Stack overflow.");
			System.exit(1);
		}
		arr[++top] = item;
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow.");
			System.exit(1);
		}
		return arr[top--];
	}
	public Boolean isFull() {
		return top == capacity - 1;
	}
	
	public Boolean isEmpty() {
		return top == -1;
	}

	public void printStack() {
		for(int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stck = new Stack(5);
//		stck.pop();
		stck.push(45);
		stck.push(33);
		stck.push(97);
		stck.printStack();
		stck.pop();
		System.out.println("Final stack status");
		stck.printStack();
		

	}

}
