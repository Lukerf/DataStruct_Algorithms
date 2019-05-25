 /** 验证回文串
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false
*/
package leetcode;

public class IsPalindrome {
	public boolean result = true;
	IsPalindrome(String s)
	{
		if(s.length() == 0)
			result = true;
		else
		{
			String sLow = s.toLowerCase();
			int head = 0;
			int tail = s.length()-1;
			while(true)
			{
				while((!isNumAlpha(sLow.charAt(head)))&&(head!=tail))
				{
					head++;
				}
				
				while((!isNumAlpha(sLow.charAt(tail)))&&(head!=tail))
				{
					tail--;
				}
				if(sLow.charAt(head)!=sLow.charAt(tail))
				{
					result = false;
					break;
				}
				if((head==tail)||((head+1)==tail))
					break;
				head++;
				tail--;
			}
        }
	}
	boolean isNumAlpha(char c)
	{
		if((c>='a'&&c<='z')||(c>='0'&&c<='9'))
			return true;
		else {
			return false;
		}
	}
}
