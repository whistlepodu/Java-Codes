class UpCast2
{
	public static void main(String args[])
	{
		U2Parent u2p = new U2Child();
		u2p.show();
		U2Child u2c = new U2Child();
	}
}

class U2Child extends U2Parent
{
	int j=23;
	//int i=11;
	void show()
	{
		System.out.println("U2Child Show() Method");
		System.out.println("Value of i in U2Child: " + i);
		System.out.println("Value of j in U2Child: " + j);
	}
	{
		System.out.println("Block in U2Child");
	}
}

class U2Parent
{
	int i=12;
	//U2Child u2c = new U2Child();
	void show()
	{
		//U2Child u2c = new U2Child();
		System.out.println("U2Parent Show() Method");
		System.out.println("Value of i in U2Parent: " + i);
	}
	{
		System.out.println("Block in U2Parent");
	}
}