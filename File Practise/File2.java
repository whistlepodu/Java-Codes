import java.io.*;
class File2
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("a.txt");
		System.out.println(f.length());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		File f1 = new File("b.txt");
		System.out.println(f.renameTo(f1));
		System.out.println(f1.lastModified());
	}
}