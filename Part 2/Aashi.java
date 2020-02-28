class Aashi
{
	public static void main(String args[])
	{
		Aashi2 a2 = new Aashi1();
		a2.show(400);
		a2.display1();
	}
}

abstract class Aashi1 extends Aashi2
{
	abstract void display();
	void display1()
	{
		System.out.println("Chauhan");
	}
}

class Aashi2
{
	void show(int y)
	{
		System.out.println("Aashi");
	}
}