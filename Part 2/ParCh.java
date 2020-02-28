class ParCh
{
	public static void main(String args[])
	{
		ParCh1 pc1 = new ParCh1();
		pc1.show();
	}
}

class ParCh1 extends ParCh2
{
	int i = 10;
	ParCh1()
	{
		System.out.println("Child");
		System.out.println(i);
		System.out.println(super.i);
	}

	void show()
	{
		System.out.println("Child Method");
		super.show();
	}
}

class ParCh2
{
	int i = 20;
	ParCh2()
	{
		System.out.println("Parent");
	}

	void show()
	{
		System.out.println("Parent Method");
	}
}