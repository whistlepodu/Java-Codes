import java.util.Scanner;
class StringAsc
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,n;
		System.out.println("Enter Size: ");
		n = in.nextInt();
		String[] str = new String[n];
		System.out.println("Enter Elements: ");
		for(i=0;i<n;i++)
			str[i] = in.next();
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String t = str[i];
					str[i]=str[j];
					str[j]=t;
				}
			}
		}

		for(String x:str)
			System.out.println(x);
	}
}