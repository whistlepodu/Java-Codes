import java.util.Scanner;
public class FiboWhile
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int term,x=0,y=1,i=0,num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Terms: ");
        term = in.nextInt();
        System.out.println("Fibonacci Series: ");
        while(i<=term)
        {
            num = x + y;
            System.out.println(num + " ,");
            x = y;
            y = num;
            i++;
        }
    }
    
}