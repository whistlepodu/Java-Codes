class IntegerClass
{
	public static void main(String args[])
	{
		Integer I1 = 115;
		Integer I2 = 112;
		System.out.println(I1);
		System.out.println(I2);
		if (I1 > I2)
			System.out.println("True");
		else
		{
			System.out.println(I1);
			System.out.println(I2);
			System.out.println("False");
		}
		if (I1.equals(I2))
			System.out.println("True");
		else
		{
			System.out.println(I1);
			System.out.println(I2);
			System.out.println("False");
		}
		Integer I3 = 127;
		Integer I4 = 127;
		System.out.println(I3);
		System.out.println(I4);
		if(I3 == I4)
			System.out.println("True");
		else
			System.out.println("False");
	}
}

//-128 to 127

//125 124