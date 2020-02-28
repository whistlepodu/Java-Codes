import java.util.Scanner;
class StringSub1
{
	public static void main(String args[])
	{
		char ch2=' ';
		int count=1,count1=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = new String();
		str = in.nextLine();
		System.out.println("String: " + str);
		char[] str1 = str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str1[i];
			int n=(int)ch;
			for(int j=i+1;j<=i+1;j++)
			{
				char ch1=str1[j];
				int n1=(int)ch1;
				if(n==n1)
					count++;
				else
					count=1;
				if(count1<count+1)
				{
					count1=count;
					ch2=str1[j];
				}
			}
		}
		System.out.println("Char: " + ch2 + ", Count: " + count1);
	}
}