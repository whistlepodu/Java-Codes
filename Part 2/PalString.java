import java.util.Scanner;
import java.io.InputStream;
public class PalString
{
    public static void main(String args[])
    {
        System.out.println('\f');
        String str, str1="";
        int len, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = in.nextLine();
        System.out.println(str);
        len = str.length();
        System.out.println("Length: " + len);
        for(i=len-1;i>=0;i--)
        {
            str1 = str1 + str.charAt(i);
        }
        System.out.println("Str1: " + str1);
        if (str.equals(str1))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}