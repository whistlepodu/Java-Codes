class AbsTry
{
	public static void main(String args[])
	{
		AbsTry3 at3 = new AbsTry3();
		AbsTry1 at1 = new AbsTry1();
		at3.show();
		at1.show();
	}
}

class AbsTry1 extends AbsTry3
{
	void show()
	{
		System.out.println("Hello");
	}
}

abstract class AbsTry2 extends AbsTry3
{
	abstract void show();
}

class AbsTry3
{
	void show()
	{
		System.out.println("Hellooo");
	}
}