/**合并两个有序数组
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
*/		
package leetcode;

public class Merge {
	/**思路简单，就通过新建一个数组存放，关键是要注意在函数中进行'=’运算不能改变目标数组的值！！！*/
	Merge(int[] nums1,int m,int[] nums2,int n)
	{
		if(m==0){copy(nums1,nums2);return;};
		if(n==0) return;
		
		int i = 0,j=0,k=0;
		int[] numsMerge = new int[m+n];
		while(i<m&&j<n)
		{
			if(nums1[i]<nums2[j])
			{
				numsMerge[k]=nums1[i];
				i++;
			}
			else {
				numsMerge[k]=nums2[j];
				j++;
			}
			k++;
		}
		if(i==m)
		{
			while(j<n)
			{
				numsMerge[k]=nums2[j];
				j++;
				k++;
			}
			copy(nums1,numsMerge);
			return;
		}
		else 
		{
			while(i<m)
			{
				numsMerge[k]=nums1[i];
				i++;
				k++;
			}
			copy(nums1,numsMerge);
			return;
		}
	}
	public void copy(int[] nums1,int[] numsMerge)
	{
		for(int i = 0;i<numsMerge.length;i++)
		{
			nums1[i] = numsMerge[i];
		}
	}
}
