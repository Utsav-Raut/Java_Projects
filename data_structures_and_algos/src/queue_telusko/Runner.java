package queue_telusko;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(13);
		
		q.deQueue();
		
		System.out.println("Size = "+q.getSize());
		
		q.show();

	}

}
