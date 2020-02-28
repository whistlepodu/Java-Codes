import java.util.Scanner;
public class Insertion
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int arr[],i,index,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        index = in.nextInt();
        arr = new int[index];
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<index;i++)
        {
            arr[i] = in1.nextInt();
        }
        for(i=1;i<index;i++)
        {
            while(i>0 && arr[i]<arr[i-1])
            {
                temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i--;
            }
        }
        System.out.println("Elements in Ascending Order: ");
        for(i=0;i<index;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("Elements in Descending Order: ");
        for(i=index-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}