import java.util.Scanner;
class Str2
{
	public static void main(String arg[])
	{
		String s1,s2,s3;
		char ch1=' ',ch2,ch3=' ',ch4='x';
		int i,j,m=0,n=0,l1,l2,c1,c2,c3=0;
		c1=c2=0;
		Scanner sc=new Scanner(System.in)
		;
		System.out.print("ENTER FIRST STRING :");
		s1=sc.nextLine();
		System.out.print("ENTER SECOND STRING :");
		s2=sc.nextLine();
		l1=s1.length();
		l2=s2.length();
		char comm[]=new char[l1+l2];
		char dif[]=new char[l1+l2];
		for(i=0;i<l1;i++)
		{
			c1=0;
			ch1=s1.charAt(i);
			for(j=0;j<l2;j++)
			{
				if(ch1==s2.charAt(j))
				{
					comm[m]=ch1;
					m++;
					c1=1;
					break;
				}
				 
				
			}
			if(c1==0)
				{
					dif[n]=ch1;
					n++;
					
				}
				
		}
		for(i=0;i<l2;i++)
		{
			c1=0;
			ch1=s2.charAt(i);
			for(j=0;j<l1;j++)
			{
				if(ch1==s1.charAt(j))
				{
					c1=1;
					break;
				}
			}
			if(c1==0)
			{
				dif[n]=ch1;
					n++;
			}
		}
		//char com1[]=new char[comm.length];
		//char dif1[]=new char[dif.length];
		String s4="";
		String s5="";
		for(j=0;j<comm.length-1;j++)
		{
			c1=0;
			ch1=comm[j];
			for(i=0;i<comm.length;i++)
			{
				if(ch1==comm[i])
				{
					c1++;	
				}
			}
			if(c1==0)
				s4=s4+""+ch1;
			else
			{
				c2=0;
				for(m=0;m<s4.length();m++)
				{
					if(ch1==s4.charAt(m))
					{
						c2=1;
						break;
					}
				}
				if(c2==0)
					s4=s4+""+ch1;
			}
			
		}
		System.out.println("COMMON CHARS ARE : " +  s4);
		s4="";
		for(j=0;j<dif.length-1;j++)
		{
			c1=0;
			ch1=dif[j];
			for(i=0;i<dif.length;i++)
			{
				if(ch1==dif[i])
				{
					c1++;	
				}
			}
			if(c1==0)
				s4=s4+""+ch1;
			else
			{
				c2=0;
				for(m=0;m<s4.length();m++)
				{
					if(ch1==s4.charAt(m))
					{
						c2=1;
						break;
					}
				}
				if(c2==0)
					s4=s4+""+ch1;
			}
			
		}
		System.out.print("DIFFERENT CHARS ARE : " + s4);
	}
}