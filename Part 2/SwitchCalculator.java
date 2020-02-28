import java.util.Scanner;
class SwitchCalculator
{
	public static void main(String args[])
	{
		SwitchCalculator sc = new SwitchCalculator();
		double x, y, z;
		int ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Choices Are: ");
		System.out.println("1. Addition" + "\n" + "2. Substraction" + "\n" + "3. Multiplication" + "\n" + "4. Division" + "\n" + "5. Modulus");
		System.out.println("Enter 1st Number: ");
		x = in.nextDouble();
		System.out.println("Enter 2nd Number: ");
		y = in.nextDouble();
		System.out.println("Enter Choice: ");
		ch = in.nextInt();
		//ch = (int)ch;
		switch(ch)
		{
			case 1: z = sc.add(x,y);
				    System.out.println("Addition: " + z);
				    break;

			case 2: z = sc.sub(x,y);
				    System.out.println("Substraction: " + z);
				    break;

			case 3: z = sc.mul(x,y);
				    System.out.println("Multiplication: " + z);
				    break;

			case 4: if (y>0)
				{
					z = sc.div(x,y);
				    	System.out.println("Division: " + z);
				}
				else
					System.out.println("Divide By Zero Error");
				break;

			case 5: if (y>0)
				{
					z = sc.mod(x,y);
				    	System.out.println("Modulus: " + z);
				}
				else
					System.out.println("Divide By Zero Error");
				break;

		}
	}
	
	double add(double a,double b)
	{
		double z = a + b;
		return z; 
	}

	double sub(double a,double b)
	{
		double z = a - b;
		return z; 
	}

	double mul(double a,double b)
	{
		double z = a * b;
		return z; 
	}

	double div(double a,double b)
	{
		double z = a / b;
		return z; 
	}

	double mod(double a,double b)
	{
		double z = a % b;
		return z; 
	}
}