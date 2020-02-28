class Try10
{
	public static void main(String args[])
	{
		try
		{
			Try101.show();
			int i = 5/0;
		}
		catch(Exception e2)
		{
			System.out.println(e2 + " in catch main");
		}
		System.out.println("Last in main");
	}
}

class Try101
{
	static void show() throws Exception
	{
		Exception e = new Exception("Any");
		try
		{
			throw e;
		}
		catch(Exception e1)
		{
			System.out.println(e1 + " in catch Try101");
		}
		System.out.println("Last in Try101");
	}
}