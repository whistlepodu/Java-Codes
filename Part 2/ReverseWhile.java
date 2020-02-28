import java.util.Scanner;
public class ReverseWhile
{
    public static void main(String args[])
    {
        int num = 0;
        int rnum = 0;
        System.out.println("Input Your Number");
        Scanner in= new Scanner(System.in);
        num = in.nextInt();
        while(num!=0)
        {
            rnum = rnum*10;
            rnum = rnum + num % 10;
            num = num/10;
        }
        System.out.println("Reverse: " + rnum);
    }
}