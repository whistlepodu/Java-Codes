class ClassUnderMain
{
	public static void main(String args[])
	{
		System.out.println("Before Class Under Main");
		class MainA
		{
			public void main(String args[])
			{
				System.out.println("Class After Main");
			}
		}
ClassUnderMain m=new ClassUnderMain();
	ClassUnderMain.MainA a=m.new MainA();
a.main("h");
		class MainB
		{
			public void main(String args[])
			{
				System.out.println("Class After Main");
				class MainB1
				{
					//public void main(String args[])
					{
						System.out.println("Class After Main");
					}
				}
			}
		}
	}
	class B
	{
		public void main(String args[])
		{
			System.out.println("Class After Main");
		}
	}
}