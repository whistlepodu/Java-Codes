class Exam5
{
	public static void main(String args[])
	{
		String s = "My Name is Sohil Sundaram";
		String s1 = "";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
			{
				s1+=Character.toUpperCase(s.charAt(i));
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				s1+=Character.toLowerCase(s.charAt(i));
			}
			else
				s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
}