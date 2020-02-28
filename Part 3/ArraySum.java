import java.util.Scanner;
public class ArraySum
{
    public static void main(String args[])
    {
        System.out.print('\f');
        int[] arr = new int[10];
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<10;i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0;i<10;i++)
        //for(int num : arr)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of Elements: " +sum);
    }
}