import java.util.*;
class Exam3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String s3 = "";
		String s4 = "";
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1>l2)
		{
			for(int i=l2-1;i>=0;i--)
			{
				s3 += "" + s1.charAt(i);
			}
			for(int i=l2-1;i>=0;i--)
			{
				s4 += "" + s2.charAt(i);
			}
		}
		else
		{
			for(int i=l1-1;i>=0;i--)
			{
				s3 += "" + s2.charAt(i);
			}
			for(int i=l1-1;i>=0;i--)
			{
				s4 += "" + s1.charAt(i);
			}
		}

		System.out.println(s4);
		System.out.println(s3);
	}
}