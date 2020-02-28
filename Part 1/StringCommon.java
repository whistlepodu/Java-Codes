import java.util.Scanner;
class StringCommon
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1 = in.next();
		System.out.println("Enter 2nd String: ");
		String s2 = in.next();
		int i,j,l1,l2;
		l1 = s1.length();
		l2 = s2.length();
		String s3 = "";
		String s4 = "";
		String s5 = "";
		String s6 = "";

		for(i=0;i<l1;i++)
		{
			for(j=0;j<l2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					String ch = "" + s1.charAt(i);
					if(s3.contains(ch)==false)
					{
						s3+=s1.charAt(i);
						break;
					}
				}
			}
		}

		System.out.println();
		System.out.println("Common String: ");
		for(i=0;i<s3.length();i++)
			System.out.print(s3.charAt(i) + " ");

		System.out.println();
		String ch1 = "";

		s4 = s1 + s2;
		s5=s4;

		for(i=0;i<s3.length();i++)
		{
			for(j=0;j<s4.length();j++)
			{
				if(s3.charAt(i)!=s4.charAt(j))
				{
					ch1 = "" + s3.charAt(i);
					s5 = s5.replace(ch1,"");
				}
			}
		}

		for(i=0;i<s5.length();i++)
		{
			char c = s5.charAt(i);
			char[] d = {c};
			String s7 = new String(d);
			if(!s6.contains(s7))
			{
				s6+=s7;
			}
		}

		System.out.println("Different String: ");
		for(i=0;i<s6.length();i++)
			System.out.print(s6.charAt(i) + " ");
	}
}