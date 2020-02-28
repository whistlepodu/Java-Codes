import java.util.Scanner;
public class ReverseRecursion
{
    public static void main(String args[])
    {
        int num = 0;
        int rnum = 0;
        System.out.println("Input the Number");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Reverse: ");
        ReverseMethod(num);
        System.out.println();
    }
    
    public static void ReverseMethod(int num)
    {
        if(num<10)
        {
            System.out.print(num);
            return;
        }
        else
        {
            System.out.print(num%10);
            ReverseMethod(num/10);
            return;
        }
    }
}