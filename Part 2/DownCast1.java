class DownCast1
{
	public static void main(String args[])
	{
		double a = 10.4;
		int b = (int)a;
		float c = (float)b;
		float d = (float)a;

		System.out.println("Double Value: " + a);		//10.4
		System.out.println("Double to Integer: " + b);		//10
		System.out.println("Integer to Float: " + c);		//10.0
		System.out.println("Double to Float: " + d);		//10.4

		char ch = 'A';
		long e = ch;
		System.out.println("Character to Long: " + e);		//65
		int f = ch;
		System.out.println("Character to Integer: " + f);	//65
		double g = ch;
		System.out.println("Character to Double: " + g);	//65.0
	}
}