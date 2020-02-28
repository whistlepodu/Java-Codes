class SainiTry
{
	static int i = 0;
	static
	{
		SainiTry st = new SainiTry();
		System.out.println("Hoosdfgh");
	}

	SainiTry()
	{
		i++;
		System.out.println(i);
		while(i<=2)
		{
			SainiTry st1 = new SainiTry();
			System.out.println(i);
			//break;
		}
		//i--;
	}

	public static void main(String args[])
	{
		//System.out.println(i);
	}
}