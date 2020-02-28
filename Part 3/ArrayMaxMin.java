import java.util.Scanner;
public class ArrayMaxMin
{
    public static void main(String args[])
    {
        System.out.print('\f');
        int[] arr = new int[10];
        int max, min, i, loc1 = 0, loc2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<10;i++)
        {
            arr[i] = in.nextInt();
        }
        max = min = arr[0];
        for(i=0;i<10;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
                loc1 = i + 1;
            }
        }
        
        for(i=0;i<10;i++)
        {
            if (arr[i] <= min)
            {
                min = arr[i];
                loc2 = i+1;
            }
        }
        
        System.out.println("Max Element: " + max + " at Location: " + loc1);
        System.out.println("Min Element: " + min + " at Location: " + loc2);
    }
}