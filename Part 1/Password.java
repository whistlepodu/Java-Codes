import java.util.Scanner;
class Password
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int age1;

		System.out.println("Enter Name: ");
		String n = in.nextLine();
		int lenN = n.length();
		
		System.out.println("Enter City: ");
		String c = in.nextLine();
		int lenC = c.length();
		if(lenC<3 || lenN<3)
		{
			System.out.println("Password can`t be generated");
			System.exit(0);
		}
		
		System.out.println("Enter Age: ");
		int age = in.nextInt();
		if(!(age>0 && age<99))
		{
			System.out.println("Password can`t be generated");
			System.exit(0);
		}
		
		System.out.println("Enter Gender: ");
		char g = in.next().charAt(0);
		if(!(g=='M' || g=='m' || g=='F' || g=='f'))
		{
			System.out.println("Password can`t be generated");
			System.exit(0);
		}
		
		int lenMin = Math.min(lenN,lenC);

		if(g=='f' || g=='F' && age<18)
		{
			String s1 = n.substring(0,3);
			String s2 = c.substring(lenC-3);
			age1 = (age/10) + (age%10);
			System.out.println(s1+age1+s2);
		}

		if(g=='f' || g=='F' && age>18)
		{
			String s1 = n.substring(lenN-3);
			String s2 = c.substring(0,3);
			int a = age/10;
			int b = age%10;
			if(a>b)
				age1 = a-b;
			else
				age1 = b-a;
			System.out.println(s1+age1+s2);
		}

		else
		{
			String s1 = "";
			for(int i=0;i<lenMin;i++)
				s1 = s1 + "" + n.charAt(i) + "" + c.charAt(i);
			if(lenN>lenC)
				s1 = s1 + n.substring(lenMin);
			else
				s1 = s1 + c.substring(lenMin);
			System.out.println(s1+age);
		}
	}
}