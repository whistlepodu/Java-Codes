class IO2
{
	public static void main(String args[])
	{
		String s = "abcd";
		byte[] b = s.getBytes();
		for(byte c:b)
			System.out.println((char)c + " " + c);
	}
}