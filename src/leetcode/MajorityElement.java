/**
求众数
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。

示例 1:

输入: [3,2,3]
输出: 3
示例 2:

输入: [2,2,1,1,1,2,2]
输出: 2
*/
package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
	public int maxNum;
	MajorityElement(int[] input)
	{
		int length = input.length;
		HashMap map = new HashMap();
		this.maxNum = input[0];
		for(int i = 0;i<length;i++)
		{
			if(map.containsKey(input[i]))
			{
				map.put(input[i],(int)map.get(input[i])+1);
			}
			else
			{
				map.put(input[i],1);
			}
		}
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry ent = (Map.Entry)iter.next();
			if((int)ent.getValue()>length/2)
			{
	
				this.maxNum = (int)ent.getKey();
			}
		}
	}

}
