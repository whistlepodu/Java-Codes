import java.util.Scanner;
public class Bubble
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int arr[],i,j,index,temp;
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
        for(i=0;i<(index+2);i++)
        {
            for(j=0;j<=((index-2)-i);j++)
            {
                if(arr[j]>arr[j+1])
                {
                   temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
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

/*
 *   for(i=0;i<=n-2;i++)
    {
      for(j=0;j<=((n-2)-i);j++)
	{
	  if(a[j]>a[j+1])
	    {
	      temp=a[j];
	      a[j]=a[j+1];
	      a[j+1]=temp;
	    }
	}
    }

 */