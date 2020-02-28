import java.util.*;
class HackerTwo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int count=0,count1=0;
		int n1 = in.nextInt();
		for(int x=0;x<n1;x++)
		{
			int n = in.nextInt();
			boolean flag=false,flag1=false, flag2=true;
			in.nextLine();
			if(n>=4 && n%4==0)
			{
				System.out.println("Enter String: ");
				String str = in.nextLine();
				for(int y=0;y<str.length();y++)
				{
					char c = str.charAt(y);
					if(c>=97 && c<=122)
						flag = true;
					else
					{
						flag=false;
						break;
					}
				}
				if(flag==true && str.length()==n)
				{
					int len = str.length();
					String[] str1 = new String[4];
					if(len>=4 && len%4==0)
					{
						str1[0] = str.substring(0,len/4);
						str1[1] = str.substring(len/4,len/2);
						str1[2] = str.substring(len/2,(3*len)/4);
						str1[3] = str.substring((3*len)/4,len);
					}

					String str11 = str1[0];
					String str12 = str1[1];
					String str13 = str1[2];
					String str14 = str1[3];

					for(int i=0;i<str11.length();i++)
					{
						if((str11.charAt(i)) == (str14.charAt(i)))
							flag1=true;
						else
						{
							count++;
							flag2 = false;
						}
					}

					for(int i=0;i<str11.length();i++)
					{
						if((str12.charAt(i)) == (str13.charAt(i)))
							flag1=true;
						else
						{
							count++;
							flag2 = false;
						}
					}

					if(flag2==false)
						System.out.println("NO " + count);
					else
						System.out.println("YES");
				}
			}
		}
	}
}