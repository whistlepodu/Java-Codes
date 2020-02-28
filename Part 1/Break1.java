class Break1
{
	public static void main(String args[])
	{
		int i=0,j=0;
		for(i=1;i<3;i++)
		{
			System.out.println("1. " + i + "       " + j);
			go:for(j=0;j<3;j++)
			{
				if(i==j)
					break go;
				System.out.println("2. " + i + "       " + j);
				System.out.println("Hi");
			}
			System.out.println("3. " + i + "       " + j);
		}
	}
}