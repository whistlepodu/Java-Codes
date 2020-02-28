import java.util.Arrays;
class Array1
{
	public static void main(String args[])
	{
		int[] a = {10, 20, 30};	
		int x = a.length;
		int sum = 0;
		for(int i=0;i<3;i++)
			sum = sum + a[i];
		System.out.println("Sum of Elements: " + sum);
		System.out.println("Length: " + x);
		System.out.println("Elements: " + Arrays.toString(a));
		System.out.println("Address: " + a);
	}
}