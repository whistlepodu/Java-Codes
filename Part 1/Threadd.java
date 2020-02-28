class Threadd1
{
	public static void main(String args[])
	{
		Threadd2 td1 = new Threadd2();
		td1.start();
	}
}

class Threadd2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(i);
	}
}