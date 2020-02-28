import java.util.Scanner;
class ArrayAvg1
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of Rows: ");
		r = in.nextInt();
		System.out.println("Enter no. of Column: ");
		c = in.nextInt();
		int num = r * c;
		int a[][]=new int[r][c];
		System.out.println("Enter Elements of Array: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		System.out.println();
		int max = a[0][0];
		int min = a[0][0];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
				else if(a[i][j] < min)
				{
					min = a[i][j];
				}
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		double avg = (double)(max + min)/num;
		System.out.println("Average: " + avg);
	}
}