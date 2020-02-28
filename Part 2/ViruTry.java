class ViruTry
{
	public static void main(String[] args)
	{
		Integer i[] = {1,2};
		String[] str = {"ar","ard"};
		Float[] fl = {2.5f, 6.8f};
		Object obj[][] = new Object[3][2];
		obj[0] = i;
		obj[1] = str;
		obj[2] = fl;
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<2;k++)
			{
				System.out.print(obj[j][k] + " ");
			}
		System.out.println();
		}
	}
}