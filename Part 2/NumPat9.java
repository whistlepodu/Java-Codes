import java.util.Scanner;
class NumPat9
{
	public static void main(String args[])
	{
		int x, y, i, j, k;
		System.out.println("Enter No. of Rows: ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		System.out.println("Enter No. of Columns: ");
		Scanner in1 = new Scanner(System.in);
		y = in1.nextInt();
		System.out.println("Required Pattern: ");
		for(i=x;i>=1;i--)
		{
			for(j=y-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1;k--)
			{
				System.out.print(i + " ");
			}
		System.out.println();
		}
	}
}