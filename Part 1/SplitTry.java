class SplitTry
{
	public static void main(String args[])
	{
		String s = "My Name is Sohil Sundaram";
		System.out.println(s);
		System.out.println("After Splitting: " + '\n');
		for(String s1:s.split(" "))
			System.out.println(s1);
	}
}