class A1
{
	public static void main(String args[])
	{
		B1 x = new B1();
		System.out.println(x.j);
		//System.out.println(x.j);
	}
}

class B1
{
	int i;
	double j;
	B1()
	{
		System.out.println(j);
		j=10.5;
		System.out.println(j);
	}
}