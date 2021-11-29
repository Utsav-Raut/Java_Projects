package stack_telusko;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		System.out.println("The stack is empty:" + stack.isEmpty());
		stack.push(15);
		stack.push(8);
		System.out.println(stack.peek());
		System.out.println("Stack size is: " +stack.size());
		stack.push(37);
		System.out.println("Stack size is: " +stack.size());
		stack.show();
		
		int result = stack.pop();
		System.out.println(result);
		System.out.println("Stack size is: " +stack.size());
		System.out.println("The stack is empty:" + stack.isEmpty());
		stack.show();

	}

}
