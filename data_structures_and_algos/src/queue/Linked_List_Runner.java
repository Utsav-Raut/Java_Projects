package queue;

public class Linked_List_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linked_List_Queue q = new Linked_List_Queue();
		q.enqueue(10);
		q.enqueue(20);
		System.out.println(q.dequeue());
		q.enqueue(27);
		q.enqueue(39);
		q.enqueue(41);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
