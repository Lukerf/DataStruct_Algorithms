 /** ��֤���Ĵ�
����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��

˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���

ʾ�� 1:

����: "A man, a plan, a canal: Panama"
���: true
ʾ�� 2:

����: "race a car"
���: false
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
