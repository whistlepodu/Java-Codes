import java.util.Scanner;
class StringReplace1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s1 = in.nextLine();
		char[] c = s1.toCharArray();

		System.out.println("Enter Charater to be Replace: ");
		char ch = in.next().charAt(0);
		String s3 = "" + ch;

		System.out.println("Enter String by which character will be replace: ");
		in.nextLine();
		String s2 = in.nextLine();

		for(int i=0;i<s1.length();i++)
		{
			if(ch == c[i])
				
		}

		

		System.out.println(s3);
	}
}