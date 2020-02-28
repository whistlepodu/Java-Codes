import java.util.Scanner;
public class Selection
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int arr[],i,j,index,min,x;
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
        for(i=0;i<index;i++)
        {
            min = arr[i];
            x=i;
            for(j=i+1;j<index;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                    x=j;
                }
            }
            arr[x]=arr[i];
            arr[i]=min;
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