class Super1
{
	public static void main(String args[])
	{
		Child ch = new Child();
		System.out.println(ch.i);
		System.out.println(ch.i);
	}
}

class Child extends Parent
{
	final int i=8;
	Child()
	{
		super(100);
		int i = 20;
		System.out.println(i);
	}
}

class Parent
{
	int i;
	Parent(int x)
	{
		i = x;
	}
}