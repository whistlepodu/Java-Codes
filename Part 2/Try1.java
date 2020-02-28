class Try1
{
	public static void main(String args[])
	{
		try
		{
			int i=5/0;
			System.out.println(i);
			System.out.println("Error");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Error Caught CATCH");
		}
		System.out.println("Error Caught");
	}
}