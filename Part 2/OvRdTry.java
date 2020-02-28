class OvRdTry
{
	public static void main(String args[])
	{
		OvRdTry1 ort1 = new OvRdTry1();
		System.out.println("Main");
		ort1.show();
	}
}

class OvRdTry1 extends OvRdTry2
{
	void show()
	{
		System.out.println("Child");
		//super.show(100);
	}
}

class OvRdTry2
{
	private void show()
	{
		System.out.println("Parent 1");
	}

	/*void show(int p)
	{
		show();
		System.out.println("Parent 2: " + p);
	}*/
}