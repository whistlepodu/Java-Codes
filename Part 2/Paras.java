class Super
{
	public static void main(String args[])
	{ 
          P p = new P();
	  p.show();
	  P q = new P(300);
	  System.out.println(q.x);
	}
}

class P extends Q
{
	int i = 200;
	P()
	{
	super();
	System.out.println("Good1");
	}
	P(int y)
	{
	super(1500,y);
	}
	void show()
	{
		System.out.println("hello");
		super.show();
		System.out.println(super.i);
	}
	
}

class Q
{
	int x,i=100;
	Q()
	{
	System.out.println("Good");
	}
	Q(int m)
	{
		x=m;
	}
	Q(int x,int y)
	{
	this.x=x+y;
	}
	void show()
	{
		System.out.println("hi");
	}
}