class PrivateAccess
{
	//PrivateAccess(){}
	public static void main(String args[])
	{
		//PrivateCheck pc = new PrivateCheck();
		PrivateAccess pa = new PrivateAccess();
		pa.show();
	}
	private void show()
	{
		System.out.println("Hello");
	}
}

/*class PrivateCheck
{
	PrivateAccess pa = new PrivateAccess();
	//pa.show();
}*/