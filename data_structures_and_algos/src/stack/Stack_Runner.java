package stack;

public class Stack_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack(5);
//		System.out.println(stack.pop());
		stack.push(29);
		System.out.println(stack.peek());
		stack.push(37);
		stack.push(67);
		stack.push(54);
		stack.push(22);
//		stack.push(19);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		stack.show();
	}

}
