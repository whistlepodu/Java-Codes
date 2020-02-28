class SuperAgain
{
	public static void main(String args[])
	{
		System.out.println("Main First Statement");
		SuperAgain2 sa2 = new SuperAgain2();
		SuperAgain2 sa21 = new SuperAgain2(12);
		SuperAgain1 sa1 = new SuperAgain1();
		sa2.show();
	}
}

class SuperAgain1
{
	SuperAgain1()
	{
		System.out.println("Default Constructor of SuperAgain1");
	}
	void show()
	{
		System.out.println("Show() method of SuperAgain1");
	}
}

class SuperAgain2 extends SuperAgain1
{
	SuperAgain2()
	{
		//super();
		System.out.println("Default Constructor of SuperAgain2");
	}
	SuperAgain2(int x)
	{
		System.out.println("One Parameter Constructor SuperAgain2");
	}
	void show()
	{
		super.show();
		System.out.println("Show() method of SuperAgain2");
		super.show();
	}
}