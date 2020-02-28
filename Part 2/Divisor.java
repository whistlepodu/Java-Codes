class Divisor
{
	public static void main(String args[])
	{
		int a=12, b=36, c=99, x, i, r1, r2, r3;
		
		if(a<b && a<c)
			x = a;
		else if(b<a && b<c)
			x = b;
		else
			x = c;

		for(i=x;i>0;i--)
		{
			r1 = a % i;
			r2 = b % i;
			r3 = c % i;

			if(r1==0 && r2==0 && r3==0)
				break;
		}
		System.out.println("Maximum Number: " + i);

		for(i=2;i<x;i++)
		{
			r1 = a % i;
			r2 = b % i;
			r3 = c % i;

			if(r1==0 && r2==0 && r3==0)
				break;
		}
		System.out.println("Smallest Number (Other than 1): " + i);
	}
}