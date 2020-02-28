class ThreeDtoOneD
{
	public static void main(String ...args)
	{
		int a[][][] = {{{1,2,3},{4,5}},{{6,7,8},{9}}};
		int p[] = new int[20];
		int q=0;
		/*for (int b[][]:a)
			for (int c[]:b)
				for (int d:c)
					p[q++]=d;*/


		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				for(int k=0;k<a[i][j].length;k++)
					p[q++]=a[i][j][k];

		System.out.println("Array Element: ");
		for(int i=0;i<q;i++)
			System.out.print(p[i] + " ");
	}
}