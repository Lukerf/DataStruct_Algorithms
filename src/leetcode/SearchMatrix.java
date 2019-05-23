/**编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
示例:

现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
给定 target = 5，返回 true。

给定 target = 20，返回 false。
*/
package leetcode;

public class SearchMatrix {
	public boolean result = false;
	/**实在想不出来，只能暴力求解*/
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
	/**从最左下角开始，所以大了只能往上走，小了只能往右走*/
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
