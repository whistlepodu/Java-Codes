class FinalVal
{
	public static void main(String args[])
	{
		FinalVal1 fv1 = new FinalVal1();
	}
}

class FinalVal1
{
	FinalVal1()
	{
		final int i = 12;					//Point 1
		System.out.println("Final Variable: " + i);
		//final int i = 13;					//Point 2
		System.out.println("Next Final: " + (i*2));		//Point 3
	}
}


/*

Point 1:

i. Constructor will not provide default value to or initialize any final specified variable
	error: variable i might not have been initialized

Point 2:

i. if i = 13; error: cannot assign a value to final variable i
ii. if final i= 13; error: <identifier> expected
iii. if final int i = 13; error: variable i is already defined in constructor FinalVal1()


Point 3:

i. if value is increment or decrement or some arithmetic operation performed like Point 2 statement, then no error pop ups.

*/