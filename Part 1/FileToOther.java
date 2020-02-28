import java.io.*;
import java.util.*;

class FileToOther
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String str1 = in.nextLine();
		String str = "";
		int occr1,occr = 0;
		String str2 = "";
		File f = new File("File1.txt");
		File f1 = new File("File2.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f1);
		BufferedReader bfr = new BufferedReader(fr);
		str = bfr.readLine();
		int len = str.length();
		int len2 = str1.length();
		for(int i=0;i+len2<str.length();i++)
		{
			occr1 = str.indexOf(str1,i);
			if(occr1>=0)
			{
				occr++;
				i=occr1;
				occr1=-1;
			}
		}
		if(occr>0)
		{
			for(int i=0;i<occr;i++)
			{
				fw.write(str1 + " ");
			}
			System.out.println("Your " + occr + " occurences are listed in new file");
		}
		else
		{
			System.out.println("Your Name is not in this File");
		}
		fr.close();
		fw.close();
	}
}