import java.util.Scanner;
public class ReverseFor
{
    public static void main(String args[])
    {
        int num = 0;
        int rnum = 0;
        System.out.println("Input the Number");
        Scanner in= new Scanner(System.in);
        num = in.nextInt();
        for(;num!=0;)
        {
            rnum = rnum*10;
            rnum=rnum+num%10;
            num=num/10;
        }
        System.out.println("Reverse: " +rnum);
    }
}