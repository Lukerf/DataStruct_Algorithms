package leetcode;

public class Main {
	public static void main(String[] args)
	{
		int[] nums = {4,5,6};
		test(nums);
		for(int i = 0 ;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}
	}
	public static void test(int[] nums)
	{
		int[] array = {1,2,3};
		nums[1]=1;
		nums = array;
		return;
	}
}
