import java.io.*;
class File1
{
	public static void main (String args[]) throws IOException
	{
		File f = new File("a.txt");
		boolean b = f.createNewFile();
		for(int i=0;i<2;i++)
		{
			if(b)
				System.out.println("File Created");
			else
				System.out.println("File Not created/Created Previously");
		}
	}
}