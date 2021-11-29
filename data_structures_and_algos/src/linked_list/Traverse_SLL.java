package linked_list;

class Traversal_Node{
	int data;
	Traversal_Node next;
	
	Traversal_Node(int data){
		this.data = data;
	}
}

public class Traverse_SLL {
	
	public Traversal_Node insertNode(int data, Traversal_Node head) {
		Traversal_Node node = head;
		if(node == null) {
			node = new Traversal_Node(data);
			head = node;
			return head;
		}else {
			while(node.next != null) {
				node = node.next;
			}
			Traversal_Node newNode = new Traversal_Node(data);
			node.next = newNode;
			return head;
		}
	}
	
	public void traverse(Traversal_Node head) {
		if(head == null) {
			System.out.println("The linked list is empty.");
		}else {
			System.out.println("Printing out the linked list data:");
			while(head.next != null) {
				System.out.print(head.data + ", ");
				head = head.next;
			}
			System.out.print(head.data);
			System.out.println();
			System.out.println("That's all.");
		}
	}

	public static void main(String[] args) {
		
		Traverse_SLL obj = new Traverse_SLL();
		Traversal_Node head = null;
		
		obj.traverse(head);
		head = obj.insertNode(27, head);
		head = obj.insertNode(17, head);
		head = obj.insertNode(51, head);
		head = obj.insertNode(27, head);
		obj.traverse(head);

	}

}
