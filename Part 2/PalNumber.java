import java.util.Scanner;
public class PalNumber
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int num, num1, num2=0, x, i=0;
        System.out.println("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        num1 = num;
        while(num!=0)
        {
            x = num % 10;
            num2 = (num2 * 10) + x;
            num = num / 10;
        }
        if (num1 == num2)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
}