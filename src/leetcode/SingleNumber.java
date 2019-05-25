
/**
只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4
*/
package leetcode;

import java.util.Arrays;

public class SingleNumber {
	/*排序，然后找后一个不等于前一个的数，不是线性时间复杂度*/
	public int result;
	SingleNumber(int[] nums)
	{
		if(nums.length == 1)
			result = nums[0];
		else {
			Arrays.sort(nums);
			for(int i = 0;i<nums.length-1;i=i+2)
			{
				if(nums[i]!=nums[i+1])
				{
					result = nums[i];
					break;
				}
			}
			if(nums[nums.length-1]!=nums[nums.length-2])
				result = nums[nums.length-1];
		}
		
	}
	/**异或操作*/
    public int singleNumber2(int[] nums) {
        
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        return res;
        
    }
}
