class Try4
{
	public static void main(String args[])
	{
		int z, x=4, y=0;
		try
		{
			System.out.println("Under Try - 1");
			z = x / y;
			System.out.println("Under Try - 2");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("Last Line");
	}
}