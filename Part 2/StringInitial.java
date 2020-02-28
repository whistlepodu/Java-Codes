import java.util.Scanner;
class StringInitial
{
	public static void main(String args[])
	{
		String s = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name: ");
		s = in.nextLine();
		int l = s.length();
		int pos=0;
		for(int i=l-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			if(ch==' ')
			{
				pos = 1;
				break;
			}
		}
		System.out.println("Initials Are: ");
		System.out.println(s.charAt(0) + ".");
		for(int j=1;j<pos;j++)
		{
			char ch1 = s.charAt(j);
			if(ch1==' ')
			{
				System.out.print(s.charAt(j+1)+".");
			}
		}
	}
}