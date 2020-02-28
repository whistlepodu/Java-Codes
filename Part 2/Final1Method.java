class Final1Method
{
	public static void main(String args[])
	{
		Final11 f11 = new Final11();
		f11.show();
		f11.show(12);
	}
}

class Final11 extends Final12
{
	void show()
	{
		System.out.println("Final1 Show() Method");
	}

	final void show(int x)
	{
		int i = x;
		System.out.println("Final1 Show(int) Method: " + i);
		super.show(x);
	}
}

class Final12
{
	void show(int x)
	{
		int i = x;
		System.out.println("Hello, I am Final Parent Class");
	}
}