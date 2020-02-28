import java.util.Scanner;
class StringSub
{
	public static void main(String args[])
	{
		int count=1,count1=0,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		char res =' ';
		String str = new String();
		str = in.nextLine();
		System.out.println(str);
		char[] str1 = str.toCharArray();
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				count=1;
			}
			if(count1<count+1)
			{
				count1=count;
				res = str1[i+1];
			}
		}
		System.out.println(res + " occured " + count1 + " times");
	}
}