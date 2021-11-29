// Simple array implementation of queue (not a circular array implementation).

package queue;

public class Queue {
	
	private int arr[];	
	private int front;
	private int rear;
	private int capacity;
	
	Queue(int capacity) {
		arr = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.capacity = capacity;
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(isEmpty()) {
				front = 0;
				rear = 0;
			}else {
				++rear;
			}
			arr[rear] = item;
			System.out.println(item + " enqueued successfully.");
		}
	}
	
	public int dequeue() {
		int item;
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}else if(front == rear) {
			item = arr[front];
			front = -1;
			rear = -1;
		}else {
			item = arr[front];
			front++;
		}
		System.out.println(item + " removed successfully from queue.");
		return item;
	}
	
	public boolean isFull() {
		return (rear == (capacity - 1));
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void showQueue() {
		System.out.println("The index of the front element = "+front);
		System.out.print("The elements are: ");
		for(int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The index of the rear element = "+rear);
	}

}
