import java.util.Scanner;
class StringCount2
{
	public static void main(String args[])
	{
		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter String: ");
		//String s1 = in.nextLine();
		//System.out.println("Enter Character: ");
		//char c = in.next().charAt(0);
		String s1 = "acascracdta";
		char c = 'a';
		String s2 = "" + c;
		int count = 0;
		while(s1.contains(s2))
			count++;
		System.out.println(count);
	}
}