class NorTry
{
	NorTry()
	{
		System.out.println("Hoo1");
	}

	{
		System.out.println("Hoo2");
	}

	static
	{
		NorTry nt = new NorTry();
		System.out.println("Hoo3");
	}

	public static void main(String args[])
	{
		System.out.println("Hoo4");
	}
}