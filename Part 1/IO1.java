class IO1
{
	public static void main(String args[])
	{
		char c = 'a';
		System.out.println(c);
		int b = c;
		System.out.println(b);
		String s = Integer.toHexString(b);
		System.out.println(s);
		char d = '\u0061';
		System.out.println(d);
	}
}