class Try6
{
	public static void main(String args[])
	{
		try
		{
			fun1();
			System.out.println("Main 1");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Catch");
		}
		System.out.println("Last");
	}
	static void fun1()
	{
		fun2();
		System.out.println("Main 2");
	}
	static void fun2()
	{
		int i = 5/0;
	}
}

/*

Control:
main() calls fun1() and call goes to fun1() and then it calls fun2() and then it calculates i, it gets Exception of 'Divide by Zero'. it returns back to fun2() and then fun1(), it doesn't execute further lines in fun1() and try block in main() because it caught an exception. Catch block will handle the exception and peint its object value. It also prints CATCH and at the end, it will print LAST.

*/