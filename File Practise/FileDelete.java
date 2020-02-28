import java.io.*;
class FileDelete
{
	public static void main(String args[]) throws Exception
	{
		FileDelete1 fd1 = new FileDelete1();
		File f = new File("D:\Docs\College Docs\Semester 5\JaVa\Home\CMD\Normal Practise\File Practise");
		fd1.InDir(f);
	}
}

class FileDelete1
{
	void InDir(File f3)
	{
		File[] s1 = f3.listFiles();
		for(File s2: s1)
		{
			if(s2.isFile())
			{
				if(s2.length()==0)
				{
					s2.delete();
				}
			}
			if(s2.isDirectory())
			{
				String s3 = "" + s2;
				File f1 = new File(s3);
				InDir(f1);
			}
		}
	}
}