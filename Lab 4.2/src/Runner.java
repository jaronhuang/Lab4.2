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
		
		List<String> headers = csv.getDataString(1);
		String[] city = new String[headers.size()];
		int val = 0;
		for (String header: headers) 
		{
			city[val] = header;
			val++;
		}
		System.out.println(city[0]);
		
		List<Integer> value = csv.getDataInteger(11);
		int[] rate = new int[value.size()];
		int aVal = 0;
		for (int rates : value)
		{
			rate[aVal] = rates;
			aVal++;
		}

		int result = 0;
		for (int i = 1031; i < 1154; i++)
		{
			result += rate[i];
		}
		
		System.out.println(result);
	}
}
