import java.util.Scanner;
public class ArrayBinary
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int i,arr[],num,index,ub,lb,mid;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        index = in.nextInt();
        arr = new int[index];
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<index;i++)
        {
            arr[i] = in1.nextInt();
        }
        System.out.println("Enter Element to be Search: ");
        Scanner in2 = new Scanner(System.in);
        num = in2.nextInt();
        lb=0;
        ub=index-1;
        mid=(lb+ub)/2;
        while(lb<=ub)
        {
            if (arr[mid] < num)
              lb = mid + 1;
            else if (arr[mid] == num)
              {
                  System.out.println("Element found ar location " + (mid+1));
                  break;
              }
            else
              ub = mid - 1;
              
            mid = (lb + ub)/2;
        }
        if(lb>ub)
          System.out.println("Element not Present");
    }
}