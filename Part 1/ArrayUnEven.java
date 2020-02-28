import java.util.Scanner;
class ArrayUnEven
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. of Rows: ");
		int rr = in.nextInt();
		int c;
		int ar1[][] = new int[rr][];
		for(int i=0;i<rr;i++)
		{
			System.out.println("Enter Column for " + i + "th Row: ");
			c = in.nextInt();
			ar1[i]=new int[c];
		}
		for(int i=0;i<rr;i++)
		{
			System.out.println("Enter Elements for " + i + "th Row: ");
			for(int j=0;j<ar1[i].length;j++)
			{
				ar1[i][j] = in.nextInt();
			}
		}

		for(int i=0;i<rr;i++)
		{
			for(int j=0;j<ar1[i].length;j++)
			{
				System.out.print(ar1[i][j]+ " ");
			}
			System.out.println();
		}
	}
}