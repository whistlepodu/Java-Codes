class FinalClass
{
	public static void main(String args[])
	{
		FinalClass1 fc1 = new FinalClass1();
	}
}

final class FinalClass1 extends FinalClass2
{
	FinalClass1()
	{
		System.out.println("Final Class 1 Demo");
	}
}

class FinalClass2		//*
{
	FinalClass2()
	{
		System.out.println("Final Class 2 Demo");
	}

}

/*

*: If specified final, then error pop up "cannot inherit from final FinalClass2"

*/