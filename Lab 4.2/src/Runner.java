import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Lab 4.2
 * @author Jaron Huang
 * 12/21/17
 */
public class Runner 
{
	public static void main(String[] args) throws IOException
	{
		File crime = new File("nyc-park-crime-stats-q3-2017.csv");
		
		CSVUtilities csv = new CSVUtilities(crime);
		
		List<String> headers = csv.getColumnHeaders();
		for (String header: headers) 
		{
			System.out.println(header);
		}
	}
}
