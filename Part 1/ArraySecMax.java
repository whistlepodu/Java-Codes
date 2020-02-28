import java.util.Scanner;
class ArraySecMax
{
	public static void main(String args[])
	{
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		n = in.nextInt();
		int[] a = new int[n];
		int l1 = a.length;
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<l1;i++)
			a[i] = in.nextInt();

		int c1=0,c2=0;
		int max = a[0],max1=a[0];

		for(int i=0;i<l1;i++)
		{
			if(a[i]>max)
			{
				max1=max;
				max=a[i];
			}
			else if(a[i]>max1)
			{
				max1 = a[i];
			}
		}

		System.out.println("2nd Max: " + max1);
	}
}