package linked_list;

class DeleteEnd{
	Double data;
	DeleteEnd next;
	
	DeleteEnd(Double data){
		this.data = data;
		this.next = null;
	}
}

public class DeleteEnd_SLL {

	public DeleteEnd insert(Double data, DeleteEnd head) {
		DeleteEnd node = head;
		if(node == null) {
			node = new DeleteEnd(data);
			head = node;
		}else {
			while(node.next != null) {
				node = node.next;
			}
			node.next = new DeleteEnd(data);
		}
		return head;
	}
	
	public DeleteEnd delete(DeleteEnd head) {
		DeleteEnd node = head;
		if(node == null) {
			System.out.println("List is empty...");
		}else {
			while(node.next.next != null)
				node = node.next;
			node.next = null;
		}
		return head;
	}
	
	public void printList(DeleteEnd head) {
		if(head == null || head.data == null)
			System.out.println("The list is empty. Nothing to print...");
		else {
			System.out.println("Printing elements..");
			while(head.next != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.print(head.data);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		DeleteEnd_SLL obj = new DeleteEnd_SLL();
		DeleteEnd head = null;
		
		head = obj.insert(15.6, head);
		head = obj.insert(17.6, head);
		head = obj.insert(111.6, head);
		head = obj.insert(77.91, head);
		head = obj.insert(1547.887, head);
		obj.printList(head);
		obj.delete(head);
		obj.printList(head);

	}

}
