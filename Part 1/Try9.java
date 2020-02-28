class Try9
{
	public static void main(String args[])
	{
		try
		{
			Try91.show();
		}
		catch(Exception e)
		{
			System.out.println(e + " In Main Catch");
		}
		System.out.println("Last in Main");
	}
}

class Try91
{
	static void show() throws Exception
	{
		Exception ee = new Exception("Any");
		throw ee;
	}
}