import java.util.Scanner;
class StringCount
{
	public static void main(String args[])
	{
		String s = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		s = in.nextLine();
		System.out.println("Enter Character: ");
		char ch = in.next().charAt(0);
		int i = s.indexOf(ch);
		int k = 0;
		while(i!=-1)
		{
			k++;
			i=s.indexOf(ch,i=i+1);
		}
		System.out.println("Occurance: " + k);
	}
}