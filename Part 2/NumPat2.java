import java.util.Scanner;
class NumPat2
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
		for(i=0;i<x;i++)
		{
			for(j=1;j<=y;j++)
			{
				System.out.print(i+j + " ");
			}
		System.out.println();
		}
	}
}