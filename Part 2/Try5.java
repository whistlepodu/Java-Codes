class Try5
{
	public static void main(String args[])
	{
		int x,i=2,j=0;
		try
		{
			System.out.println("Inner Try");
			x=i/j;
		}
		finally
		{
			System.out.println("Final Block");
		}
		System.out.println("Last");
	}
}