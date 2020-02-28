class Anony1 extends Anony11
{
	public static void main(String args[])
	{
		Anony11 a11 = new Anony11()
		{
			int i = 95;
			void show()
			{
				System.out.println("5");
				i++;
				//System.out.println(a11.i);
				System.out.println(i);
			}
		};
		a11.show();
		System.out.println("1");
		System.out.println(a11.i);
	}
}

class Anony11
{
	int i = 89;
	void show()
	{
		System.out.println("2");
		i--;
	}
}