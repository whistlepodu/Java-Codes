class StaticTry
{
	int i = 20;
	{
		System.out.println(i);
		System.out.println("Normal Block");
	}

	static
	{
		System.out.println("Static Block");
	}

	StaticTry()
	{
		System.out.println("Constructor");
	}

	static void thistry()
	{
		System.out.println("Static Method");
	}

	public static void main(String arsg[])
	{
		StaticTry st = new StaticTry();
		st.thistry();
	}
}