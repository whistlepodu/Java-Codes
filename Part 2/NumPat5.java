import java.util.Scanner;
class NumPat5
{
	public static void main(String args[])
	{
		int x, y, i, j;
		System.out.println("Enter No. of Rows: ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		System.out.println("Enter No. of Columns: ");
		Scanner in1 = new Scanner(System.in);
		y = in1.nextInt();
		System.out.println("Required Pattern: ");
		for(i=1;i<=x;i++)
		{
			for(j=i;j<=y;j++)
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}