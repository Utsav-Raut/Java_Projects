package stack_telusko;

public class Stack {

	int stck[] = new int[5];
	int top = 0;
	public void push(int data) {
		if(top==5) {
			System.out.println("Stack is full.");
		}else {
			stck[top++] = data;
		}
	}
	
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty. Enter some elements to continue.");
			System.exit(0);
		}else {
			--top;
			data = stck[top];
			stck[top] = 0;
		}
		return data;
	}
	
	public int peek() {
		int data = stck[top-1];
		return data;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		if(top<=0)
			return true;
		return false;
	}
	public void show() {
		for(int n: stck) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
} 
