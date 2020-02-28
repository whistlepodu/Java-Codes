class SoumyaThis
{
	public static void main(String args[])
	{
		SoumyaThis1 st1 = new SoumyaThis1();
		st1.display();
	}
}

class SoumyaThis1
{

	int i;
	void display()
	{
		SoumyaThis1 st1 = new SoumyaThis1(500);
		int i = 300;
		System.out.println(st1.i);
		System.out.println(i);
		System.out.println(this.i);
	}
	SoumyaThis1()
	{
		i = 20;
	}
	SoumyaThis1(int x)
	{
		i = x;
	}
}