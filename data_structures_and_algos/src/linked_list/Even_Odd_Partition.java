package linked_list;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}


public class Even_Odd_Partition {
	Node head = null;

	public Node oddEvenList() {
		if(head == null || head.next == null)
			return head;
		
		Node even = head;
		Node odd = head.next;
		Node oddHead = odd;
		
		while(odd != null && odd.next != null) {
			even.next = odd.next;
			even = odd.next;
			
			odd.next = even.next;
			odd = even.next;
		}
		even.next = oddHead;
		
		return head;
		
	}
	
	public Node createList(int data) {
		Node node = head;
		if(head == null) {
			node = new Node(data);
			head = node;
			return head;
		}else {
			while(node.next != null)
				node = node.next;
			node.next = new Node(data);
		}
		return head;
		
	}
	
	public void showList() {
		Node node = head;
		System.out.print("The elements are : ");
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Even_Odd_Partition obj = new Even_Odd_Partition();
		obj.createList(5);
		obj.createList(1);
		obj.createList(3);
		obj.createList(7);
		obj.createList(3);
		obj.createList(9);
		
		obj.showList();
		
		obj.oddEvenList();
		obj.showList();

	}

}
