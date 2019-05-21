package stack_queue;

public class stack_chain {
	node head = new node();
	public stack_chain() {
		head.next = null;
	}
	public void enstack(String item) {
		node insert = new node();
		insert.item = item;
		insert.next = head.next;
		head.next = insert;
	}
	public String outstack() {
		if(head.next==null)return null;
		String item = head.next.item;
		head.next = head.next.next;
		return item;
	}
}
