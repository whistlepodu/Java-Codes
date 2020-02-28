import java.util.*;
class Random
{
	public static void main(String args[])
	{
		long rng = 888888;
		long x;
		for(int i=0;i<20;i++)
		{
			x = (long)(Math.random()*rng)+111111;
			System.out.println(x);
		}
	}
}