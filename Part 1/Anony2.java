class Anony2
{
	public static void main(String args[])
	{
		Anony21 a21 = new Anony21()
		{
			int i = 20;
			int show()
			{
				i++;
				System.out.println(i);
				return 1;
			}
		};
		a21.show();
		System.out.println(a21.i);
		System.out.println(a21.show());
	}
}

class Anony21
{
	int i = 20;
	int show()
	{
		System.out.println(i);
		return i;
	}
}