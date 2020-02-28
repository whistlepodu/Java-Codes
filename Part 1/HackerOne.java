import java.util.*;

class HackerOne
{
	public static void main(String args[])
	{
		Scanner in  = new Scanner(System.in);
		int m = in.nextInt();
		for(int y=0;y<m;y++)
		{
			int n = in.nextInt();
			int x = 0;
			int[] a = new int[n+1];
			for(int i=0;i<n+1;i++)
			{
				a[i]=in.nextInt();
			}
			int sum = 0;
			if(a[0]%2==0)
				sum = a[0]+1;
			else
				sum = a[0];
			for(int i=1;i<n+1;i++)
			{
				x = sum + a[i];
				if((x%2)!=0)
				{
					sum = sum + a[i];
				}
				else if(a[i]!=a[n])
				{
					sum = sum + a[i] + 1;
				}
				else
				{
					sum = sum + a[i];
				}
			}
			System.out.println(sum);
		}
	}
}