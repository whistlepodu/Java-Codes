import java.util.Scanner;
class SeriesSum
{
	public static void main(String args[])
	{
		int i, x, n, sum=0, sum1 = 0;
		System.out.println("Enter Value of x: ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		System.out.println("Enter Value of n: ");
		n = in.nextInt();
		SeriesSum ss = new SeriesSum();
		for(i=n;i>0;i--)
		{
			sum = ss.power(x,i);
			sum1 = sum1 + sum;
		}
		System.out.println("Sum of Series: " + sum1);
	}
	int power(int a, int b)
	{
		if (b==0)
			return 1;
		else
			return (a * power(a,b-1));
	}
}