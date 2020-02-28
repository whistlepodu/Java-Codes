class UpCastP
{
	public static void main(String args[])
	{
		UpCastP1 ucp1 = new UpCastP2();
		ucp1.show();
		System.out.println(ucp1 instanceof UpCastP2);
		System.out.println(ucp1 instanceof UpCastP1);
	}
}

class UpCastP2 extends UpCastP1
{
	void show()
	{
		System.out.println("C");
	}
}

class UpCastP1
{
	void show()
	{
		System.out.println("P");
	}
}