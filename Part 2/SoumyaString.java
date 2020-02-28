import java.util.Scanner;
class SoumyaString
{
	public static void main(String args[])
	{
		String s = new String("Sohil Sundaram");
		int l = s.length();
		System.out.println(l + " " + s);

		Scanner x = new Scanner(System.in);
		String x1 = x.nextLine();
		int l1 = x1.length();
		System.out.println(l1 + " " + x1);
	}
}