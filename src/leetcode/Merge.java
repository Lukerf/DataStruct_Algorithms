/**�ϲ�������������
�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

˵��:

��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]
*/		
package leetcode;

public class Merge {
	/**˼·�򵥣���ͨ���½�һ�������ţ��ؼ���Ҫע���ں����н���'=�����㲻�ܸı�Ŀ�������ֵ������*/
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
