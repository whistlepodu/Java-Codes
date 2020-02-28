class ConstPre
{
	ConstPre()
	{
		this(2,3);
		System.out.println("Hi");
	}
	
	ConstPre(int i)
	{
		this(2,3);
		System.out.println("Hello");
	}

	ConstPre(int i, int y)
	{
		System.out.println("Hiii");
	}
	
	public static void main(String args[])
	{
		ConstPre cp = new ConstPre();
	}
}