package stack_telusko;

class Stack_Dynamic {
	int capacity = 2;
	int stck[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		if(capacity==size())
			expand();
		stck[top++] = data;
	}
	
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stck, 0, newStack, 0, length);
		stck = newStack;
		capacity *= 2;
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
			shrink();
		}
		return data;
	}
	
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2)
			capacity = capacity/2;
		int newStack[] = new int[capacity];
		System.arraycopy(stck, 0, newStack, 0, length);
		stck = newStack;
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

public class Runner_Stack_Dynamic{
	public static void main(String[] args) {
		Stack_Dynamic dstck = new Stack_Dynamic();
		dstck.push(15);
		dstck.show();
		dstck.push(8);
		dstck.show();
		dstck.push(17);
		dstck.show();
		dstck.push(22);
		dstck.show();
		dstck.push(31);
		dstck.push(4);
		dstck.show();
		dstck.push(11);
		dstck.push(64);
		dstck.push(29);
		dstck.show();
	}
}
