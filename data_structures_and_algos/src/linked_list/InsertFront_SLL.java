package linked_list;

class InsertFront_Node{
	int data;
	InsertFront_Node next;
	InsertFront_Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class InsertFront_SLL {
	
	public InsertFront_Node insertAtFront(int data, InsertFront_Node head) {
		InsertFront_Node node = head;
		if(node == null) {
			node = new InsertFront_Node(data);
			head = node;
			return head;
		}else {
			InsertFront_Node firstNode = new InsertFront_Node(data);
			firstNode.next = node;
			head = firstNode;
			return head;
		}
	}
	
	public void traverse(InsertFront_Node head) {
		if(head == null) {
			System.out.println("List is empty, hence nothing to print");
		}else {
			System.out.println("The elements in the list are:");
			while(head.next != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.print(head.data);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertFront_SLL obj = new InsertFront_SLL();
		InsertFront_Node head = null;
		
		head = obj.insertAtFront(10, head);
		obj.traverse(head);
		head = obj.insertAtFront(8, head);
		obj.traverse(head);
		head = obj.insertAtFront(16, head);
		head = obj.insertAtFront(97, head);
		obj.traverse(head);
	}

}
