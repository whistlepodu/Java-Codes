import java.util.Scanner;

public class StringEmail
{

	public static void main(String args[])
	{

		int count=0,atcount=0,i;
		boolean flag = true, flag1 = true, flag2 = true, flag3 = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Email id: ");
		String str = new String();
		String str1 = new String();
		str = in.next();

//Length of Email Address

		int len = str.length();

//Index of LstDot and Count letters after that (till end)

		int lastdot = str.lastIndexOf(".");
		for(i=lastdot;i<len-1;i++)
			count++;

//Compare name of server domain like .com or .in

		str1 = str.substring(lastdot+1,len);
		if(count==2)
		{
			if(str1.equals("in"))
				flag3=true;
			else
				flag3=false;
		}
		else if(count==3)
		{
			if(str1.equals("com") || str1.equals("org") || str1.equals("net"))
				flag3=true;
			else
				flag3=false;
		}
		else
			flag3=false;

//Count the occurance of @ in email address

		for(i=0;i<len-1;i++)
		{
			if(str.charAt(i)=='@')
				atcount++;
		}

//Check for special character in starting of email address

		if(((int)str.charAt(0)>=32) && ((int)str.charAt(0) <=64))
			flag1 = false;
		else if(((int)str.charAt(0)) >=91 && ((int)str.charAt(0) <=96))
			flag1 = false;
		else if(((int)str.charAt(0)>=123))
			flag1 = false;
		else
			flag1 = true;

//Check special symbol between @(last) and .(last)

		for(i=str.lastIndexOf("@")+1;i<lastdot;i++)
		{
			if(((int)str.charAt(i)>=32) && ((int)str.charAt(i) <=64))
				flag=false;
			else if(((int)str.charAt(i)) >=91 && ((int)str.charAt(i) <=96))
				flag=false;
			else if(((int)str.charAt(i)>=123))
				flag=false;
		}

//Check for Consecutive Special character

		for(i=0;i<str.indexOf("@");i++)
		{
			for(int j=i+1;j<=i+1;j++)
			{
				if(((int)str.charAt(i)>=32) && ((int)str.charAt(j)>=32) && ((int)str.charAt(i)<=47) && ((int)str.charAt(j)<=47))
					flag2=false;
				else if(((int)str.charAt(i)>=58) && ((int)str.charAt(j)>=58) && ((int)str.charAt(i)<=64) && ((int)str.charAt(j)<=64))
					flag2 = false;
				else if(((int)str.charAt(i)) >=91 && ((int)str.charAt(j)) >=91 && ((int)str.charAt(i) <=96) && ((int)str.charAt(j) <=96))
					flag2 = false;
				else if(((int)str.charAt(i)>=123) && ((int)str.charAt(j)>=123))
					flag2 = false;
			}
		}

//Last formulation for validation

		if((flag==true) && (atcount==1) && (flag1==true) && (flag2 == true) && (flag3 == true))
			System.out.println("Valid Id");
		else if(flag==false && flag1==false && flag2==false && flag3 == false)
			System.out.println("Invalid Id");
		else
			System.out.println("Invalid Id");

	}

}