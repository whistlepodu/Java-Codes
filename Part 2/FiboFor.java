import java.util.Scanner;
public class FiboFor
{
    public static void main(String args[])
    {
        System.out.print('\f');
        int term, num, i,x=0, y=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Terms: ");
        term = in.nextInt();
        for(i=0;i<=term;i++)
        {
            num = x + y;
            System.out.print(num + " , ");
            x = y;
            y = num;
        }
    }
}
