package linked_list;

class InsertAfterNode{
	String data;
	InsertAfterNode next;
	
	InsertAfterNode(String data){
		this.data = data;
		this.next = null;
	}
}
public class InsertAfterNode_SLL {
	
	public InsertAfterNode insertNode(String data, InsertAfterNode head) {
		InsertAfterNode node = head;
		
		if(node == null) {
			node = new InsertAfterNode(data);
			head = node;
		}else {
			while(node.next != null) {
				node = node.next;
			}
			node.next = new InsertAfterNode(data);
		}
		return head;
	}

	public InsertAfterNode insertAfterNode(String dataToInsertAfter, String dataToInsert, InsertAfterNode head) {
		InsertAfterNode node = head;
		
		if(node == null) {
			System.out.println("The list is empty.");
			System.exit(0);
		}else {
			while(node.next != null) {
				if(node.data != dataToInsertAfter)
					node = node.next;
				else {
					InsertAfterNode newNode = new InsertAfterNode(dataToInsert);
					newNode.next = node.next;
					node.next = newNode;
					return head;
				}
			}
			if(node.data != dataToInsertAfter) {
				System.out.println("The data node does not exist.");
			}else {
				InsertAfterNode newNode = new InsertAfterNode(dataToInsert);
				newNode.next = node.next;
				node.next = newNode;
			}
		}
		return head;
	}
	
	public void printList(InsertAfterNode head) {
		System.out.println("The list elements are:");
		while(head.next != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
	public static void main(String[] argdatas) {
		// TODO Auto-generated method stub
		InsertAfterNode_SLL obj = new InsertAfterNode_SLL();
		InsertAfterNode head = null;
		
//		obj.insertAfterNode("Tom", head);
		head = obj.insertNode("Tim", head);
		head = obj.insertNode("Alg", head);
		head = obj.insertNode("Trig", head);
		head = obj.insertNode("Geo", head);
		obj.printList(head);
//		obj.insertAfterNode("Sam", "Payne", head);
		head = obj.insertAfterNode("Alg", "Payne", head);
		obj.printList(head);
		head = obj.insertAfterNode("Geo", "Sue", head);
		obj.printList(head);

	}

}
