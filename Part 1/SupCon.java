class SupCon
{
	public static void main(String args[])
	{
		SupCon1 sc1 = new SupCon1();
		SupCon1 sc2 = new SupCon1(2,3);
		System.out.println(sc1.i);
	}
}

class SupCon1 extends SupCon2
{
	SupCon1()
	{
		super(20);
	}
	SupCon1(int x,int y)
	{
		super(20,40);
	}
}

class SupCon2
{
	int i,a,b;
	SupCon2(int x)
	{
		i = x;
		System.out.println(i);
	}
	SupCon2(int x,int y)
	{
		a = x;b = y;
		System.out.println(a+b);
	}
}