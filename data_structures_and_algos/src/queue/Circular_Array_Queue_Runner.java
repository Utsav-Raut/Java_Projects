package queue;

public class Circular_Array_Queue_Runner {

	public static void main(String args[]) {
		Circular_Array_Queue circ_que = new Circular_Array_Queue(5);
		
		circ_que.enqueue(20);
		circ_que.enqueue(30);
		circ_que.enqueue(40);
		circ_que.enqueue(50);
		circ_que.showQueue();
		
		circ_que.dequeue();
		circ_que.dequeue();
		circ_que.showQueue();
		circ_que.enqueue(60);
		circ_que.enqueue(70);
		circ_que.showQueue();
	}
	

}
