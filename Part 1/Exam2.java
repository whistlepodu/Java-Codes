import java.util.*;
class Exam2
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		System.out.println(v.size());
		System.out.println(v.capacity());

		for(int i=0;i<v.capacity();i++)
		{
			v.addElement(i);
		}

		System.out.println(v);

		System.out.println(v.size());
		System.out.println(v.capacity());

		for(int i=v.size()-1;i>=0;i--)
		{
			System.out.print(v.elementAt(i) + " ");		
		}

		System.out.println();

		Iterator ia = v.iterator();
		while(ia.hasNext())
		{
			System.out.println(ia.next());
		}
	}
}