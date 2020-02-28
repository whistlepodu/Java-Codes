import java.util.Scanner;
class ArrayAvg2
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
		double sum=0,avg = 0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum = (double)sum + a[i][j];
			}
		avg = (double)sum / num;
		sum = 0;
		System.out.println("Average of "+ i + " row: " + avg); 
		}
	}
}