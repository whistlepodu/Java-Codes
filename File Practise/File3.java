import java.io.*;
class File3
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("a.txt");
		f.createNewFile();
		FileReader fw = new FileReader(f);
	}
}