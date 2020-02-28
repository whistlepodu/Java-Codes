import java.util.*;
class Prac2
{
	public static void main(String args[])
	{
		Vector v = new Vector();
		v.addElement(2);
		v.addElement(3.7);
		v.addElement("Sohil");
		v.addElement("hello");
		v.addElement('C');

		System.out.println(v);

		for(int i=0;i<v.size();i++)
		{
			Object o = v.elementAt(i);
			if(o instanceof String)
			{
				String a = (String)v.elementAt(i);
				if(Character.isUpperCase(a.charAt(0)))
					System.out.println(a);
			}
			if(o instanceof Character)
			{
				char a = (Character)v.elementAt(i);
				if(Character.isUpperCase(a))
					System.out.println(a);
			}
		}
	}
}