class DecIni
{
	int i;
	static
	{
		System.out.println("Static Variable");
	}
	{
		System.out.println("Block Variable");
	}
	void show()
	{
		System.out.println("Method Variable");
	}
	public static void main(String args[])
	{
		DecIni DI = new DecIni();
		DI.show();
	}
	DecIni()
	{
		System.out.println("Constructor Variable");
	}
}


/* Output Scenario:

	Static Variable
		Block Variable
			Constructor Variable
				Method Variable

*/

/*Explanation:	Execution Precedence:
			1. Static
			2. Block
			3. Constructor
			4. Method
*/