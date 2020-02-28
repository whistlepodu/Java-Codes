import java.util.Scanner;
import java.io.*;

class FileWrite
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("FileWrite.txt");
		FileWriter fw = new FileWriter(f);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String x = in.nextLine();
		fw.write(x);
		fw.close();
	}
}