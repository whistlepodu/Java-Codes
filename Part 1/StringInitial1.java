class StringInitial1
{
	public static void main(String args[])
	{
		String s1 = "Ram Kumar Mishra";
		int count=0;
		int l1 = s1.length();

		for(int i=0;i<l1;i++)
			if((int)s1.charAt(i)==32)
				count++;

		String s2 = "";
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l1;j++)
			{
				if((int)s1.charAt(j)==32)
				{
					s2 = s1.substring(i,j);
					System.out.println(s2);
				}
			}
		}
	}
}