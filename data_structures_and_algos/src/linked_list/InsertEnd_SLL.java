package linked_list;

class InsertEnd_Node {
	int data;
	InsertEnd_Node next;
	InsertEnd_Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class InsertEnd_SLL {

	public InsertEnd_Node insertAtEnd(int data, InsertEnd_Node head) {
		InsertEnd_Node node = head;
		if(node == null) {
			node = new InsertEnd_Node(data);
			head = node;
		}else {
			while(node.next != null) {
				node = node.next;
			}
			node.next = new InsertEnd_Node(data);
		}
		return head;
	}
	
	public void printList(InsertEnd_Node head) {
		System.out.println("The list elements are:");
		while(head.next != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		InsertEnd_SLL obj = new InsertEnd_SLL();
		InsertEnd_Node head = null;
		
		head = obj.insertAtEnd(5, head);
		obj.printList(head);
		head = obj.insertAtEnd(15, head);
		head = obj.insertAtEnd(17, head);
		head = obj.insertAtEnd(35, head);
		obj.printList(head);
		
	}

}
