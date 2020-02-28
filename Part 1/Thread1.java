class Thread1
{
	public static void main(String args[]) throws Exception
	{
		Thread11 t11 = new Thread11();
		Thread12 t12 = new Thread12();
		System.out.println("Main Thread 1");
		t11.start();
		System.out.println("Main Thread 2");
		t12.setDaemon(true);
		System.out.println("Main Thread 3");
		t12.start();
		System.out.println("Main Thread 4");
	}
}

class Thread11 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread 11");
		}
	}
}

class Thread12 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread 12");
		}
	}
}