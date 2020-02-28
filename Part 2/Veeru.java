class Veeru
{
	public static void main(String args[])
	{
		Veeru1 v1 = new Veeru2();
		v1.show();
	}
}

class Veeru2 extends Veeru1
{
	int i = 1;
	void show()
	{
		System.out.println("Veeru 2");
		System.out.println(i);
		System.out.println(j);
	}
}

class Veeru1
{
	int i=24, j=3;
	void show()
	{
		System.out.println("Veeru 1");
		System.out.println(i);
	}
}