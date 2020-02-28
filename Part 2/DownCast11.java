class DownCast11
{
	public static void main(String args[])
	{
		DownCast13 dc13 = new DownCast12();
		dc13.show();
		DownCast12 dc12 = (DownCast12)dc13;
		dc12.show();
	}
}

class DownCast12 extends DownCast13
{
	void show1()
	{
		System.out.println("Down Cast 12 Child");
	}
	static void show()
	{
		System.out.println("Down Cast 12 Show() Child");
		//super.show();	//remove static
		//this.show1();
	}
	{
		System.out.println("Normal Block Under Down Cast 12");
	}
	static
	{
		System.out.println("Static Block Under Down Cast 12");
	}	
}

class DownCast13
{
	static void show()
	{
		System.out.println("Down Cast 13 Parent");
	}
	{
		System.out.println("Normal Block Under Down Cast 13");
	}
	static
	{
		System.out.println("Static Block Under Down Cast 13");
	}
}