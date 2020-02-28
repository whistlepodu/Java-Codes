import java.util.*;
import java.text.*;
class Currency
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        	double payment = sc.nextDouble();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRENCH);
		System.out.println(nf);
        	//System.out.println("US: " + us);
        	//System.out.println("India: " + india);
        	//System.out.println("China: " + china);
        	//System.out.println("France: " + france);
	}
}