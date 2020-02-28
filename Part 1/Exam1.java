class Exam1
{
	public static void main(String aregs[]) throws Exception
	{
		while(true)
		{
			double a = Math.random();
			double x = a * 10;
			boolean
			if(x>=2.00 && x<=4.00)
			{
				if((int)x%2==0)
					System.out.println("Even: " + x);
				else
					System.out.println("Odd: " + x);
			}
			Thread.sleep(500);
		}
	}
}