class This
{
	This()
	{
		int a = 6;
		int b = 8;
	}
	final int a=9;
	int b=8;
	public void setdata(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void showdata()
	{
		System.out.println("Value of A: " + a);
		System.out.println("Value of B: " + b);
	}
	public static void main(String args[])
	{
		This th = new This();
		th.setdata(2,3);
		th.showdata();
	}
}