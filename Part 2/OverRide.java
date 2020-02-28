class OverRide
{
	public static void main(String args[])
	{
		OverA oa = new OverA();
		oa.show();
		OverA.main(6);
		OverB ob = new OverB();
		ob.show();
	}
}

class OverA extends OverB
{
	public static void main(int i)
	{
			OverB ob = new OverB();
			ob.show();
	}
	void show()
	{
		System.out.println("OverA");
		super.show();
		super.show(12);
	}
}

class OverB
{
	OverB()
	{
		show();
		this.show();
	}
	void show()
	{
		System.out.println("OverC");
	}
	void show(int p)
	{
		System.out.println(p);
	}
}