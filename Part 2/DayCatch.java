import java.util.*;
class DayCatch
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		System.out.println(getDay(day,month,year));
	}

	public static String getDay(String day, String month, String year)
	{
		//String id = day/month/yyyy;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		date dt1 = sdf.parse(id);
		dateFormat df = new SimpleDateFormat("EEEE");
		String dayy = df.format(dt1);
		return dayy;
	}
}