package stack_queue;


public class queue_chain {
	node head = new node();
	node tail = new node();
	public queue_chain() {
		head.next = tail;
	}
	public void enqueue(String item) {
		node tail_ = new node();
		tail.item = item;
		tail.next = tail_;
		tail = tail_;
	}
	public String outqueue() {
		if(head.next==tail)return null;
		String item;
		item = head.next.item;
		head.next.item = null;
		head = head.next;
		return item;
	}
}
