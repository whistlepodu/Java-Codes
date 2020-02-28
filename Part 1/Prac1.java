class Prac1
{
	public static void main(String args[])
	{
		String s1 = "abcdef";
		String s2 = "xyz";
		int len = Math.min(s1.length(),s2.length());
		String s3 = "";
		for(int i=-0;i<len;i++)
			s3 += s1.charAt(i) + "" + s2.charAt(i);
		System.out.println(s3);
	}
}