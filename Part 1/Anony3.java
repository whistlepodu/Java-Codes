class Anony3
{
	public static void main(String args[])
	{
		Anony31 a31 = new Anony31()
		{
			int j = 20;
			void show()
			{
				System.out.println(i+ " " +j);
				System.out.println("Main Anony31");
			}
		};

		a31.show();

		System.out.println(a31.i);
	}
}

class Anony31
{
	int i = 30;

	void show()
	{
		System.out.println("Outside Anony31");
	}

	{
		System.out.println("Block");
	}

	static
	{
		System.out.println("Static Block");
	}
}