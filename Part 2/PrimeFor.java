import java.util.Scanner;
public class PrimeFor
{
    public static void main(String args[])
    {
        System.out.println('\f');
        int num,i,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. to Check: ");
        num = in.nextInt();
        for(i=2;i<=num-1;i++)
        {
            temp = num % i;
            if(temp == 0)
            {
                System.out.println("Number isn't Prime");
                break;
            }
        }
        if(i==num)
        {
            System.out.println("Number is prime");
        }
        //System.out.println("Number: " + num);
    }
}

/*
 * int i;
  for(i=2;i<=a-1;i++)
    {
      if(a%i==0)
	{
	  printf("\n%d is not Prime",a);
	  break;
	}
    }
  if(i==a)
    {
      printf("\n%d is Prime",a);
    }
 */