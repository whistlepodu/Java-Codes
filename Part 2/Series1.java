import java.util.*;
import java.io.*;
class Series1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("No. of Terms: ");
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int s = 0;
			for(int j=0;j<c;j++)
			{
				int x = (int)Math.pow(2,j) * b;
				if(j==0)
					s = s + a + x;
				else
					s = s + x;
				System.out.print(s + "\t");
			}
		System.out.println();
		}
	}
}