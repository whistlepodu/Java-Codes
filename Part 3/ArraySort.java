import java.util.Scanner;
public class ArraySort
{
    public static void main(String args[])
    {
        int[] arr = new int[10];
        int i,j,arrasc,arrdesc;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<10;i++)
        {
            arr[i] = in.nextInt();
        }
        
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                 if (arr[i] > arr[j])
                 {
                     arrasc = arr[i];
                     arr[i]=arr[j];
                     arr[j]=arrasc;
                 }
            }
        }
        
        System.out.println("Ascending Order: ");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if (arr[i] < arr[j])
                {
                    arrdesc = arr[i];
                    arr[i]=arr[j];
                    arr[j]=arrdesc;
                }
            }
        }
        
        System.out.println("\nDescending Order: ");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        
        

    }
}