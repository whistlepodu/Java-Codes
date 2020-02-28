import java.util.Scanner;
public class ArraySearchOne
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int i,num,Flag=0,Loc=0,arr[],index;
        Scanner ind = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        index = ind.nextInt();
        arr = new int[index];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<index;i++)
        {
            arr[i] = in.nextInt();
        }
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter Element to Search: ");
        num = in1.nextInt();
        for(i=0;i<index;i++)
        {
            if (arr[i] == num)
                {
                    Flag = 1;
                    Loc = i+1;
                }
        }
        if (Flag==1)
            System.out.println("Element Prsent at Location " + Loc);
        else
                System.out.println("Element not Present");
    }
}