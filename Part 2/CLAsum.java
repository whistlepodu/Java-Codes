class CLAsum
{
	public static void main(String args[])
	{
		int i,sump=0,sumn=0;
		for(i=0;i<args.length;i++)
		{
			int x = Integer.parseInt(args[i]);
			if(x>0)
			{
				sump+=x;
			}
			else
			{
				sumn+=x;
			}
		}
		System.out.println(sump);
		System.out.println(sumn);
		System.out.println("Diff: " + (sump+sumn));
	}
}