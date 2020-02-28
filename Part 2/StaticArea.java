import java.util.*;
class StaticArea
{
	static int B, H, area;
	static boolean flag;
	static
	{
		Scanner in = new Scanner(System.in);
		Exception ex = new Exception();
		try
		{
			B = in.nextInt();
			H = in.nextInt();
			if(B<=0 || H<=0)
				throw(ex);
			else
				flag = true;
		}
		catch(Exception e)
		{
			System.out.println(e + ": Breadth and height must be positive");
		}
	}
	public static void main(String args[])
	{
		if(flag)
		{
			int area = H * B;
			System.out.println(area);
		}
	}
}