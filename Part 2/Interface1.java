class Interface1
{
	public static void main(String args[])
	{
		Interface12 i12 = new Interface12();
		i12.show();
		i12.show1();
		Interface14 i14 = new Interface14();
	}
}

interface Interface11
{
	void show();
	int i = 30;
}

interface Interface13
{
	void show();
	public static final int i = 20;
	void show1();
}

class Interface12 implements Interface11, Interface13
{
	public void show()
	{
		System.out.println("Show() Method");
	}
	public void show1()
	{
		System.out.println("Show1() Method");
	}
	{
		System.out.println(Interface11.i);
		System.out.println(Interface13.i);
	}
}

class Interface14 extends Interface12 implements Interface11, Interface13
{
	{
		System.out.println("Normal Block in Interface14");
	}
}