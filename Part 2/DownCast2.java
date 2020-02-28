class DownCast2
{
	public static void main(String args[])
	{
		DownCast21 dc21 = new DownCast22();
		DownCast22 dc22 = (DownCast22)dc21;
		DownCast21 dc23 = new DownCast23();
		DownCast23 dc24 = (DownCast23)dc23;
		dc24.show();
		dc21.show();
	}
}

class DownCast21
{
	{
		System.out.println("Normal Block DownCast21");
	}
	void show()
	{
		System.out.println("DownCast21 Show() Method");
	}
}

class DownCast22 extends DownCast21
{
	{
		System.out.println("Normal Block DownCast22");
	}
}

class DownCast23 extends DownCast21
{
	{
		System.out.println("Normal Block DownCast23");
	}
	void show()
	{
		System.out.println("DownCast23 Show() Method");
	}
}