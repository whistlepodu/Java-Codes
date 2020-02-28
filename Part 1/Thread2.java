class Thread2
{
	public static void main(String args[])
	{
		Thread21 t21 = new Thread21();
		Thread22 t22 = new Thread22();
		t21.run();
		t22.run();
	}
}

class Thread21 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread21");
			try
			{
				sleep(200);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Thread22 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread22");
		}
	}
}