class PGTry
{
	static int i;
	int j;
	public void proc1()
	{
		i=11;
		j=22;
	}
	public static void proc2()
	{
		i=1;
		//j=2;
	}
	//static PGTry()
	{
		i=0;
		j=0;
	}
	public static void main(String args[])
	{
	}
}

/*A. False coz
i is static so it can be initialized in proc1()
B. True coz
non static method can initialize static or non static variable.
C. False coz
j is non static and proc2() is static so, initialization not possible.
D. There is not any constructor (if there is, it has to be PG())
E. False coz
Refer to answer of C
*/