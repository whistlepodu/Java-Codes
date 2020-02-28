class PrivateCheck
{
	public static void main(String args[])
	{
		PrivateCheck2 pc2 = new PrivateCheck2();
	}
}

class PrivateCheck2 extends PrivateCheck3
{
	PrivateCheck2()
	{
		System.out.println("Private Check 2");
	}
}

class PrivateCheck3
{
	PrivateCheck3()
	{
		System.out.println("Private Check 3");
	}
}