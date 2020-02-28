class Abstract1
{
	public static void main(String args[])
	{
		AbstractOne Abs1 = new AbstractOne();
		Abs1.show();
		Abs1.show1();
	}
}

class AbstractOne extends AbstractTwo							// Normal Class inherited with Abstract class'AbstractTwo'
{
	int i = 10;									// Instance Variable
	AbstractOne()									// Constructor
	{
		System.out.println("Normal Constructor");
		System.out.println("Value of i: " + i);
	}
	{										// Normal Block
		System.out.println("Normal Block");
		System.out.println("Value of i: " + i);
		super.show2();								// Parent Method Call
	}
	static										// Static Block
	{
		System.out.println("Static Block");
	}
	void show()									// Child Class Method
	{
		System.out.println("Abstract Method Show of AbstractTwo");
		System.out.println("Value of i: " + i);
		super.show2();								// Parent Method Call
	}
	void show1()
	{
		System.out.println("Normal Local Method");
		System.out.println("Value of i: " + i);
		this.show();
	}
}

abstract class AbstractTwo								// Abstract Class
{
	abstract void show();								// Abstract Method
	void show2()									// Normal Method
	{
		int j = 20;
		System.out.println("Parent Show2 Method");
		System.out.println("Parent Show2 Method, j: " + j);
	}
}