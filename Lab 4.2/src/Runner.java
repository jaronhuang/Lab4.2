import java.io.File;
import java.io.IOException;
import java.util.List;

public class Runner 
{
	public static void main(String[] args) throws IOException
	{
		File crime = new File("nyc-park-crime-stats-q3-2017.csv");
		
		CSVUtilities csv = new CSVUtilities(crime);
		
		List<String> headers = csv.getDataString(1);
		for (String data : headers)
		{
			System.out.println(data);
		}
	}
}
