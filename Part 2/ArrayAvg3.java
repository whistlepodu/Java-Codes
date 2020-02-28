import java.util.Scanner;
class ArrayAvg3
{
	public static void main(String args[])
	{
		int r,r1,c,c1,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Initial Limit of Row: ");
		r1 = in.nextInt();
		System.out.println("Enter Initial Limit of Columns: ");
		c1 = in.nextInt();
		int[] a = new int[r1];
		System.out.println();
		System.out.println("Enter No. of Rows: ");
		r = in.nextInt();
		int[][] b = new int[r][c1];
		System.out.println();
		for(i=0;i<r;i++)
		{
			System.out.println("Enter No. of Column for " + i + "th Row: ");
			c = in.nextInt();
			a[i] = c;
		}
		for(i=0;i<r;i++)
		{
			System.out.println();
			System.out.println("Enter Elements for " + i + "th Row: ");
			for(j=0;j<a[i];j++)
			{
				b[i][j] = in.nextInt();
			}
		}
		System.out.println();
		System.out.println("Array is: ");
		System.out.println();
		for(i=0;i<r;i++)
		{
			for(j=0;j<a[i];j++)
			{
				System.out.print(b[i][j] + " ");
			}
		System.out.println();
		}
		int sum = 0;
		double avg = 0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<a[i];j++)
			{
				sum = sum + b[i][j];
			}
		avg = (double)sum / a[i];
		System.out.println();
		System.out.println("Average of " + i + "th Row: " + avg);
		sum = 0;
		}
	}
}