import java.util.Scanner;
class StringSecMax
{
	public static void main(String args[]) //throws NoMatch
    	{
		Scanner in = new Scanner(System.in);
		int noc = 123;
		int[] count = new int[noc];
        	int i;
		System.out.println("Enter String: ");
      		String s1 = in.next();
      		char res = ' ';

		for(i=0;i<s1.length();i++)
            	{
			//System.out.println(count[s1.charAt(i)] + " " + s1.charAt(i) + " " + count[97]);
			(count[s1.charAt(i)])++;
		}
		
     		int count1=0,count2=0;

        	for(i=0;i<noc;i++)
        	{
         		if(count[i]>count[count1])
         		{
          	      		count2=count1;
                		count1=i;
				
				//System.out.println(i + " " + count[i] + " " + count1 + " " + count[count1] + " " + count2 + " " + count[count2]);
            		}
     			else if(count[i]>count[count2] && count[i]!=count[count1])
			{
				count2=i;
				
				//System.out.println(i + " " + count[i] + " " + count1 + " " + count[count1] + " " + count2 + " " + count[count2]);
			}
		}

		if(count2!=0)
		{
			res=(char)count2;
			System.out.println("2nd Max: " + res);
		}
		//else
		//	throw new NoMatch("No 2nd Max Found");
	}
}

/*class NoMatch extends Exception
{
	NoMatch(String s)
	{
		super(s);
	}
}*/
