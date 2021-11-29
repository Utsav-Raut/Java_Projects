package linked_list;

class DeleteFront {
	Float num;
	DeleteFront next;
	
	DeleteFront(Float num){
		this.num = num;
		this.next = null;
	}
}

public class DeleteFront_SLL {
	
	public DeleteFront insert(Float data, DeleteFront head) {
		DeleteFront node = head;
		if(node == null) {
			node = new DeleteFront(data);
			head = node;
		}else {
			while(node.next != null)
				node = node.next;
			node.next = new DeleteFront(data);
		}
		return head;
	}
	
	public DeleteFront delete(DeleteFront head) {
		DeleteFront node = head;
		if(node == null) {
			System.out.println("The list is empty and hence nothing to delete.");
			System.exit(0);
		}else if(node.next == null) {
			node.num = null;
			head = node;
		}else {
			head = node.next;
		}
		return head;
	}

	public void printList(DeleteFront head) {
		if(head == null || head.num == null) {
			System.out.println("The list is empty");
		}else {
			System.out.println("The list elements are:");
			while(head.next != null) {
				System.out.print(head.num + " ");
				head = head.next;
			}
			System.out.print(head.num);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DeleteFront_SLL obj = new DeleteFront_SLL();
		DeleteFront head = null;
		obj.printList(head);
		head = obj.insert(15.6f, head);
//		obj.printList(head);
//		head = obj.delete(head);
//		obj.printList(head);

		head = obj.insert(17.6f, head);
		head = obj.insert(45.25f, head);
		head = obj.insert(197.22f, head);
		head = obj.insert(4.6f, head);
		obj.printList(head);
		head = obj.delete(head);
		obj.printList(head);
		
	}

}
