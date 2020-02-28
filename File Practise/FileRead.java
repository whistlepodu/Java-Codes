import java.util.Scanner;
import java.io.*;

class FileRead
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("File1.txt");
		FileReader fr = new FileReader(f);
		int len = fr.read();
		int x;
		if(len>-1)
		{
			while((x=fr.read()) != -1)
			{
				System.out.print((char)x);
			}
		}
		else
			System.out.println("File Empty");
	}
}