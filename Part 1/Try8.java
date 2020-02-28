class Try8
{
	public static void main(String args[])
	{
		try
		{
			Try81.show();
		}
		catch(Exception ee)
		{
			System.out.println("HelloMainIn");
			throw ee;
		}
		finally
		{
			System.out.println("HelloMainFinally");
		}
		System.out.println("HelloMainOut");
	}
}

class Try81
{
	static void show()// throws Exception
	{
		try
		{
			int i = 5 / 0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("HelloTry81In");
			throw ae;
		}
		finally
		{
			System.out.println("HelloTry81Finally");
		}
		System.out.println("HelloTry81Out");
	}
}