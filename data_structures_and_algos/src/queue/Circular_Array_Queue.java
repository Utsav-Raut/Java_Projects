package queue;

public class Circular_Array_Queue {

	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	
	public Circular_Array_Queue(int capacity) {
		arr = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.capacity = capacity;
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full.");
		}else if(isEmpty()) {
			front = 0;
			rear = 0;
		}else
			rear = ((rear + 1) % capacity);
		arr[rear] = item;
		System.out.println(item + " inserted successfully.");
	}
	
	public int dequeue() {
		int item;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}else if(front == rear) {
			item = arr[front];
			front -= 1;
			rear -= 1;
		}else {
			item = arr[front];
			front = ((front + 1) % capacity);
		}
		System.out.println(item + " removed from queue.");
		return item;
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return 0;
		}
		return arr[front];
	}
	
	public boolean isFull() {
		return (((rear + 1)%capacity) == front);
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		return false;
	}
	
	public void showQueue() {
		System.out.println("Front index is = "+front);
		System.out.print("The elements are : ");
		for(int i=front; i<=rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Rear index is = "+rear);
	}
}
