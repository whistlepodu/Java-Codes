import java.util.Scanner;
class Try7
{
	public static void main(String args[])
	{
		boolean flag=false;
		NoMatchException nme = new NoMatchException();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = in.next();
		for(int i=0;i<args.length;i++)
		{
			if(s.equals(args[i]))
				flag=true;		
		}
		try
		{
			if(flag==true)
				System.out.println("Character Found");
			else
				throw nme;
		}
		catch(NoMatchException e)
		{
			System.out.println("No Match Exception");
		}
	}
}

class NoMatchException extends Exception
{}