class UpCast1
{
	public static void main(String args[])
	{
		int a = 100;
		long b = a;
		float c = b;
		float d = a;
		double e = a;
		double f = c;

		System.out.println("Integer to Long: " + b);
		System.out.println("Long to Float: " + c);
		System.out.println("Integer to Float: " + d);
		System.out.println("Integer to Double: " + e);
		System.out.println("Float to Double: " + f);
	}
}