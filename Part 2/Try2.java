class Try2
{
	public static void main(String args[])
	{
		int[] b = {1,2,3};
		System.out.println("First");
		try
		{
			System.out.println("Second");
			int i = 5 / b[3];
			System.out.println("Third");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Last");
	}
}