class ThreadSync
{
	public static void main(String[] args)
	{
		ThreadSync1 ts1 = new ThreadSync1();
		ThreadSync2 ts2 = new ThreadSync2();
		ts1.start();
		ts2.start();
	}
}

class ThreadSync1 extends Thread
{
	public void run()
	{
		ThreadSync3.show("ThreadSync1");
	}
}

class ThreadSync2 extends Thread
{
	public void run()
	{
		ThreadSync3.show("ThreadSync2");
	}
}

class ThreadSync3
{
	synchronized static void show(String str)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(str + " " + i*2);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}