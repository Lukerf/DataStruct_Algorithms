
/**
ֻ����һ�ε�����
����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�

˵����

����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����

ʾ�� 1:

����: [2,2,1]
���: 1
ʾ�� 2:

����: [4,1,2,1,2]
���: 4
*/
package leetcode;

import java.util.Arrays;

public class SingleNumber {
	/*����Ȼ���Һ�һ��������ǰһ����������������ʱ�临�Ӷ�*/
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
	/**������*/
    public int singleNumber2(int[] nums) {
        
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res=res^nums[i];
        }
        return res;
        
    }
}
