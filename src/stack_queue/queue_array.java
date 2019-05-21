package stack_queue;

public class queue_array {
	public String[] items;
	public int n;
	public int tail=0;
	public int head=0;
	public queue_array(int n) {
		this.n=n;
		items = new String[n];
	}
	public boolean enqueue(String item) {
		if(tail==n) {
			if(head==0)return false;
			for(int i = head;i<tail;i++) {
				items[i-head]=items[i];
			}
			tail -= head;
			head=0;
		}
		items[tail]=item;
		tail++;
		return true;
	}
	public String outqueue() {
		String item;
		if(head==tail)return null;
		item = items[head];
		head++;
		return item;
	}
}
