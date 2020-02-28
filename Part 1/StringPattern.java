import java.util.Scanner;
class StringPattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter No. of Terms: ");
		int n = in.nextInt();
		String s1 = "#";
		int i=0,j;
		int x = n;
		//while(x>0)
		for(i=0;i<x;i++)
		{
			int m = (int)Math.pow(2,i);
			//i++;
			for(j=0;j<m;j++)
			{
				System.out.print(s1 + " ");
			}
			System.out.println(j);
			//x--;
		}
	}
}