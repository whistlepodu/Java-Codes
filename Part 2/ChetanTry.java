class ChetanTry
{
	public static void main(String[] args)
	{
		ChetanTry1 c1 = new ChetanTry1();
		ChetanTry1 c2 = new ChetanTry1();
		ChetanTry1 c3 = new ChetanTry1();
		System.out.println(ChetanTry2.a);
	}
}

class ChetanTry1 extends ChetanTry2
{
	static int a = 0;
	{
		a++;
	}
}

class ChetanTry2
{
	static int a = 0;
	static
	{
		a++;
	}
	{
		a--;
	}
}