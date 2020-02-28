class ParentChild
{
	public static void main(String args[])
	{
		Parentt pt = new Childd();
		//Childd cd = new Childd();
		pt.show();
		//Childd cd1 = new Parentt();		Error
	}
}

class Childd extends Parentt
{
	/*Childd()
	{
		System.out.println("Child");
	}
	{
		System.out.println("Child Block");
	}*/
	void show()
	{
		System.out.println("Child Method");
	}
}

class Parentt
{
	Parentt()
	{
		System.out.println("Parent");
	}
	{
		System.out.println("Parent Block");
	}
	void show()
	{
		System.out.println("Parent Method");
	}
}