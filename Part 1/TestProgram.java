class TestProgram
{
	public static void main(String[] args)
	{
		int a=0,b=0,c=0;
		int x = (++a + b--) * c++;
		System.out.println(x);
	}
}