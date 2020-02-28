import java.io.*;
import java.util.*;
class ObjSer implements Serializable
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("sohil.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjSer os = new ObjSer();
		Date d = new Date();
		oos.writeObject(os + "\n" + d);
		fos.close();
	}
}