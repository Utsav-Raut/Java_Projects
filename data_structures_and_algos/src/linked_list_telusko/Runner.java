package linked_list_telusko;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(18);
		list.insertAtStart(25);
		list.insertAt(0, 55);

		list.show();
		
		list.deleteAt(2);
		System.out.println();
		
		list.show();
	}
}
