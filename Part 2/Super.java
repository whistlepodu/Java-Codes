class Super
{
	public static void main(String args[])
	{
		Sub sb = new Sub();
		System.out.println("Super: " + sb.i);
	}
}

class Sub extends Sub1
{
	int i = super.i;
}


class Sub1
{
	int i = 10;
}