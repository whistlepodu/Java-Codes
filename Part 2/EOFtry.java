import java.util.Scanner;
class EOFtry
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i = 1;
		while(in.hasNext())
		{
			String str = in.nextLine();
			System.out.println(i++ +". " + str);
		}
	}
}