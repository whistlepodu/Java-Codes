import java.util.Scanner;
class StringCount1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = in.nextLine();
		System.out.println("Enter Character: ");
		char c = in.next().charAt(0);
		String s2 = "" + c;
		int count = 0;
		for(String s3:s1.split(s2,-1))
			count++;
		System.out.println(count-1);
	}
}