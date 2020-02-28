import java.util.*;

class HackerThree
{
	public static void main(String[] args)
	{
		int m1=0, m2=0, m3=0, m4=0 ,m5=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Line: ");
		int a = in.nextInt();				//City Count
		int b = in.nextInt();				//Road Count
		int c = in.nextInt();				//Exam Center
		int d = in.nextInt();				//Query Count
		int[] b1 = new int[b];
		int[] b2 = new int[b];
		int[] b3 = new int[b];
		int[] c1 = new int[c];
		int[] d1 = new int[d];
		System.out.println("Enter Road Map:");
		for(int i=0;i<b;i++)
		{
			b1[i] = in.nextInt();			//First City
			b2[i] = in.nextInt();			//Second City
			b3[i] = in.nextInt();			//Distance (Cost) Between Tem
		}
		System.out.println("Enter Test Center: ");
		for(int i=0;i<c;i++)
		{
			c1[i] = in.nextInt();			//Test Center
		}
		System.out.println("Enter No. of Query: ");
		for(int i=0;i<d;i++)
		{
			d1[i] = in.nextInt();			//No of Query
		}

		for(int i=0;i<d;i++)
		{
			int x = d1[i];
			for(int j=0;j<b;j++)
			{
				for(int k=0;k<c;k++)
				{
					if(x==c1[k])
						System.out.println("A NearBy: " + c1[i]);
					else
					{
						if(b1[j]==x)
						{
							m1 = b3[j];
						}
						if(b2[j]==x)
						{
							m2 = b3[j];
						}
						if(m1<m2)
							System.out.println("B NearBy: " + m1);
						else
							System.out.println("C NearBy: " + m2);
					}
				}
			}
		}
	}
}