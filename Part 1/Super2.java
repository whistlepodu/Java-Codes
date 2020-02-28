class Super2
{
	public static void main(String args[])
	{
		Child1 ch = new Child1();
		System.out.println(ch.i);			//2000
		Child1 ch1 = new Child1(200);
		System.out.println(ch1.i);			//3200
		Child1 ch2 = new Child1(121,231);
		System.out.println(ch2.i);			//2000
	}
}

class Child1 extends Parent1
{
	Child1()
	{
		super(2000);
	}

	Child1(int x)
	{
		super(3000,x);
	}
	Child1(int x, int y)
	{
		this(5,6);
	}
}

class Parent1
{
	int i;
	Parent1(int m)
	{
		i = m;
	}

	Parent1(int x, int y)
	{
		i = x + y;
	}
}