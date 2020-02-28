class Soumya1
{
	public static void main(String args[])
	{
		Soumya1 s1 = new Soumya1();
		System.out.println("Hii");
		show();
		Soumya2 s2 = new Soumya2();
		s2.show1();
	}
	static
	{
		int i = 20;
		System.out.println("Hello");
	}
	{
		int a = 20;
		System.out.println("Sohil");
	}
	static void show()
	{
		System.out.println("Show");
		int i = 20;
		System.out.println("Show i: " + i);
	}
	void show1()
	{
		System.out.println("Show1");
	}
}

class Soumya2
{
	Soumya2()
	{
		System.out.println("Soumya2 Constructor");
	}
	void show1()
	{
		System.out.println("Show1");
	}
}