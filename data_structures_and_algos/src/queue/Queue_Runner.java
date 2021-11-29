package queue;

public class Queue_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que = new Queue(8);
		que.enqueue(2);
		que.enqueue(5);
		que.enqueue(7);

		que.showQueue();
		que.dequeue();
		que.dequeue();
//		que.dequeue();
//		que.dequeue();
//		que.dequeue();
//		que.dequeue();
		
		que.enqueue(1);
		que.enqueue(9);
		que.enqueue(10);
		que.enqueue(4);
		que.enqueue(6);
//		que.showQueue();
		que.enqueue(2);
		que.enqueue(19);
		que.showQueue();
	}

}
