import java.util.Scanner;
public class ArrayReverse
{
    public static void main(String args[])
    {
        System.out.print('\f');
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(int i =0;i<10;i++)
        {
            arr[i] = in.nextInt();
        }
        
        System.out.println("Elements of Array: ");
        for(int i =0;i<10;i++)
        {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        
        System.out.println("\nReverse Order: ");
        for(int i =9;i>=0;i--)
        {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
    }
}