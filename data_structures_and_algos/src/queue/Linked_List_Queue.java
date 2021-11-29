package queue;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class Linked_List_Queue {
	Node front;
	Node rear;
	
	Linked_List_Queue(){
		this.front = this.rear = null;
//		this.rear = null;
	}
	
	public void enqueue(int key) {
		Node temp = new Node(key);
		
		if(this.front == null && this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp; //making the address part to point to the next node
		this.rear = temp;     //storing the address of the next node as current address in rear
	}
	
	public int dequeue() {
		Node temp = this.front;
		int node_data;
		node_data = temp.data;
		
		if(this.front == null) {
			System.out.println("Queue is empty.");
			return 0;
		}else if(this.front == this.rear){
			this.front = this.rear = null;
		}else {
			this.front = this.front.next;
		}
		return node_data;
	}

}
