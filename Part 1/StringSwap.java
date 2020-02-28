import java.util.Scanner;
class StringSwap
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1 = in.next();
		System.out.println("Enter 2nd String: ");
		String s2 = in.next();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1>1 && l2>1)
		{
			String s3 = s2.charAt(l2-1) + "" + s1.substring(1,l1-1) + "" + s2.charAt(0);
			String s4 = s1.charAt(l1-1) + "" + s2.substring(1,l2-1) + "" + s1.charAt(0);
			System.out.println("1st String: " + s3);
			System.out.println("2nd String: " + s4);
		}
		else
		{
			String s3 = "" + s2.charAt(0);
			String s4 = "" + s1.charAt(0);
			System.out.println("1st String: " + s3);
			System.out.println("2nd String: " + s4);
		}
	}
}