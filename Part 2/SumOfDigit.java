import java.util.Scanner;
class SumOfDigit
{
	public static void main(String args[])
	{
		int x, n, s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		while(n>=10)
		{
			x = n;
			s = 0;
			while (x>0)
			{
				s = s + (x % 10);
				x = x / 10;
			}
		n = s;
		}
		System.out.println("Sum of Digits: " + n);
	}
}