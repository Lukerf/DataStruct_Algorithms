package stack_queue;

public class test {
	public static void main(String args[]) {
		stack_chain test1 = new stack_chain();
		test1.enstack("first0");
		test1.enstack("first1");
		test1.enstack("first2");
		test1.enstack("first3");
		test1.enstack("first4");
		String item1 = test1.outstack();
		String item2 = test1.outstack();
		String item3 = test1.outstack();
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
	}
}
