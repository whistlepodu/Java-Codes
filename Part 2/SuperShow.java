class SuperShow
{
	public static void main(String args[])
	{
		ChildShow cs = new ChildShow();
		cs.show();
		ParentShow ps = new ParentShow();
		ps.show1();
	}
}
class ChildShow extends ParentShow
{
	int i = 10;
	void show()
	{
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
class ParentShow
{
	int i = 20;
	void show1()
	{
		System.out.println(i);
	}
}