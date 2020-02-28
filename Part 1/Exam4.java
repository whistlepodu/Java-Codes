import java.text.*;
class Exam4
{
	public static void main(String args[]) throws Exception
	{
		while(true)
		{
			DecimalFormat df = new DecimalFormat("#.##");
			double x = Math.random();
			String z = df.format(x*10);
			double m = Double.parseDouble(z);
			if(m>=2.00 && m<=4.00)
				System.out.println(m);
			Thread.sleep(500);
		}
	}
}