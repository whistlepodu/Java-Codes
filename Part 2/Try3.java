class Try3
{
	public static void main(String args[])
	{
		System.out.println("First");
		try
		{
			int i = 5 / 0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Last");
	}
}

/*

Here, Exception of ArithmeticException is caught at line 8, but in catch block, it is handling exception of NullPointerException sp JVM will hadnle this exception and because JVN is handling the exception now, further statements won't be exceuted.

*/