/**��дһ����Ч���㷨������ m x n ���� matrix �е�һ��Ŀ��ֵ target���þ�������������ԣ�

ÿ�е�Ԫ�ش������������С�
ÿ�е�Ԫ�ش��ϵ����������С�
ʾ��:

���о��� matrix ���£�

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
���� target = 5������ true��

���� target = 20������ false��
*/
package leetcode;

public class SearchMatrix {
	public boolean result = false;
	/**ʵ���벻������ֻ�ܱ������*/
	SearchMatrix(int[][] matrix,int target){
		for(int i = 0;i<matrix.length;i++)
		{
			for(int j = 0;j<matrix[i].length;j++)
			{
				if(matrix[i][j]==target)
				{
					this.result = true;
					return;
				}
			}
		}
	}
	/**�������½ǿ�ʼ�����Դ���ֻ�������ߣ�С��ֻ��������*/
	public boolean SearchMatrix2(int[][] matrix,int target)
	{
		if(matrix == null||matrix.length == 0 )
		{
			return false;
		}
		int m = matrix.length-1;
		int n = 0;
		while(n<matrix[0].length&&m>=0)
		{
			if(matrix[m][n]==target)
			{
				return true;
			}
			else
			{
				if(matrix[m][n]<target)
				{
					n++;
				}
				else {
					m--;
				}
			}
		}
		return false;
	}
}
