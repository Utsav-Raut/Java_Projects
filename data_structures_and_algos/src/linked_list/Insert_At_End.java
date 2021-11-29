package linked_list;

class At_End_Node{
	int data;
	At_End_Node next;
	
	At_End_Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class Insert_At_End {
	At_End_Node head = null;

	At_End_Node insertNodeAtTail(int data) {
		At_End_Node node = head;
        if(node == null){
            node = new At_End_Node(data);
            head = node;
            return head;
        }else {
	        while(node.next != null){
	            node = node.next;
	        }
	        node.next = new At_End_Node(data);;
        }
        return head;
    }
	
	public void showList() {
		At_End_Node node = head;
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

		Insert_At_End obj = new Insert_At_End();
	
		obj.insertNodeAtTail(5);
		obj.insertNodeAtTail(1);
		obj.insertNodeAtTail(3);
		obj.insertNodeAtTail(7);
		obj.insertNodeAtTail(3);
		obj.insertNodeAtTail(9);
		
		obj.showList();
	}

}
