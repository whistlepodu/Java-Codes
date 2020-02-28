import java.util.Scanner;
class StringReplace
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter String: ");
		String s1 = in.nextLine();

		System.out.println("Enter Charater to be Replace: ");
		char ch = in.next().charAt(0);

		System.out.println("Enter String by which character will be replace: ");
		in.nextLine();

		String s2 = in.nextLine();

		String s3 = s1.replace(ch + "" , s2);
		System.out.println(s1 + " " + s3);
	}
}