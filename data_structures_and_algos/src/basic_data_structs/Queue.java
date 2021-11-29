package basic_data_structs;

public class Queue {
	private int capacity;
	private int que[];
	private int front, rear;
	
	Queue(int size){
		que = new int[size];
		capacity = size;
		front = -1;
		rear = -1;
	}
	public Boolean isEmpty() {
		if (front == -1)
				return true;
		return false;
	}
	
	public Boolean isFull() {
		if(front >= 0 && rear == capacity - 1) {
			return true;
		}
		return false;
	}

	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full. Cannot insert any more elements.");
		}else {
			if(front == -1) {
				front = 0;
				rear = 0;
			}
			rear++;
			que[rear] = item;
			System.out.println("Enqueue operation successful. Item " + item + " inserted.");
		}
	}
	
	public int dequeue() {
		int ele;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		ele = que[front];
		if(front >= rear) {
			front = -1;
			rear = -1;
		}
		else
			front++;
		System.out.println("Element " + ele + " was retrieved.");
		return ele;
	}
	
	public void displayQueue() {
		if(isEmpty()) {
			System.out.println("Nothing to display as the queue is empty.");
			System.exit(1);
		}
		System.out.println("Front Index - "+front);
		System.out.println("Items ----> ");
		for(int i=front; i<=rear; i++) {
			System.out.print(que[i] + " ");
		}
		System.out.println();
		System.out.println("Rear Index - "+rear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue list = new Queue(5);
//		list.displayQueue();
		
		list.enqueue(24);
		list.enqueue(48);
		list.enqueue(72);
		list.enqueue(96);
		
		list.displayQueue();
		
		list.enqueue(44);
		list.enqueue(77);
		
		list.dequeue();
		
		list.displayQueue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		

	}

}
