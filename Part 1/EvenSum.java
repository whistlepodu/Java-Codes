class EvenSum
{
	public static void main(String args[])
	{
		int i,sum=0,x,y,z;
		boolean flag=false;
		for(i=0;i<args.length;i++)
		{
			try
			{
				flag=false;
				x=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
				flag=true;
			}
			if(flag==false)
			{
				x=Integer.parseInt(args[i]);
				y=x;
				while(x>0)
				{
					z=x%10;
					if(z!=0 && z%2==0)
					{
						sum+=y;
						break;
					}
					x=x/10;
				}
			}
		}
		System.out.println("Sum: " + sum);
	}
}