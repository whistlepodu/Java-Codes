import java.util.Scanner;
class NoMatchException1
{
	public static void main(String args[])
	{
		boolean flag=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = in.next();
		try
		{
			NoMatchException2.check(args,s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class NoMatchException2 extends Exception
{
	static void check(String str1[], String str2) throws NoMatchException2
	{
		boolean flag = false;
		NoMatchException2 nme = new NoMatchException2("No Match");
		for(int i=0;i<str1.length;i++)
		{
			if(str2.equals(str1[i]))
				flag = true;
		}
		try
		{
			if(flag==true)
				System.out.println("Character Found");
			else
				throw nme;
		}
		catch(NoMatchException2 e)
		{
			System.out.println("Exception: No Match");
		}
	}
	NoMatchException2(String s)
	{
		super(s);
	}
}