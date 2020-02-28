import java.util.Scanner;
class StackOperation
{
	static char ch1;
	static int num;
	public static void main(String args[])
	{
		int t;
		StackFunction sf = new StackFunction();
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Choices are: ");
			System.out.println("Push: 1" + '\n' + "Pop: 2" + '\n' + "Display: 3" + '\n' + "Exit: 4");
			System.out.println("Enter Your Choice: ");
			int ch = in.nextInt();
			switch(ch)
			{
				case 1	:	System.out.println("Enter Number to be Inserted: ");
						num = in.nextInt();
						sf.puchStack(num);
						System.out.println();
						break;
				case 2	:	t = sf.popStack();
						if(t!=0)
							System.out.println("Deleted Element: " + t);
						System.out.println();
						break;
				case 3	:	sf.displayStack();
						break;
				case 4	:	System.exit(0);
						break;
			}
		}while(true);
	}
}

class StackFunction
{
	static int top = -1;
	static int stack[] = new int[20];
	void puchStack(int num)
	{
		if (top>=20)
			System.out.println("Stack Full");
		else
		{
			top = top+1;
			stack[top]=num;
		}
	}

	int popStack()
	{
		int x=0;
		if(top<0)
			System.out.println("Stack is empty.");
		else
		{
			x = stack[top];
			top = top - 1;
		}
		return x;
	}

	void displayStack()
	{
		int i;
		if(top<0)
		{
			System.out.println("Empty Stack");	
		}
		else
		{
			System.out.println();
			for(i=top;i>=0;i--)
			{
				System.out.print(stack[i]);
				System.out.println();
			}
		}
	}
}