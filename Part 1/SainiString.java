class SainiString
{
	public static void main(String args[])
	{
		String s1 = "abcdef";
		char[] s11 = s1.toCharArray();
		String s2 = "ba";
		char c;
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					c = s1.charAt(i);
					s11[j]=c;
				}
			}
		}
		String s3 = new String(s11);
		System.out.println(s3);
	}
}