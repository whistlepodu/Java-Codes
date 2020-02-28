import java.util.Scanner;
class Interface2
{
	public static void main(String args[])
	{
		Interface21 i21 = new Interface21();
		i21.main("A");
		System.out.println("A");
		i21.show();
	}
}

class Interface21 implements Interface22
{
	public static void main(String args)
	{
		System.out.println("B");
	}

	public void show()
	{
		System.out.println("D");
	}
}

interface Interface22
{
	public static void main(String args)
	{
		System.out.println("C");
	}

	void show();
}