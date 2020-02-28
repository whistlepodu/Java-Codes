class Wrap1
{
	public static void main(String args[])
	{
		int i = 8;
		Integer I = new Integer(i);	//Boxing
		System.out.println(I);
		int j = I.intValue();		//UnBoxing
		System.out.println(j);
		Integer J = 4;			//AutoBoxing
		System.out.println(J);
		Object O = J;			//UpCasting
		System.out.println(O);
		Object O1 = 6;
		System.out.println(O1);
		Integer I1 = (Integer)O1;	//DownCasting
		System.out.println(I1);
		Integer M = 7;
		System.out.println(M);
		int i1 = M;			//AutoUnBoxing
		System.out.println(i1);
	}
}