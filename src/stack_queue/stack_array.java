package stack_queue;

public class stack_array {
	String[] items;
	int n;
	int tail = -1;
	public stack_array(int n) {
		items = new String[n];
		this.n = n;
	}
	public boolean enstack(String item) {
		if(tail==n-1)return false;
		tail++;
		items[tail] = item;
		return true;
	}
	public String outstack() {
		if(tail==-1)return null;
		String item;
		item = items[tail];
		tail--;
		return item;
	}
}
