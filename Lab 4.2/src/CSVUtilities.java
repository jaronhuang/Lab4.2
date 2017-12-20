import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilities 
{
	private ArrayList<String> CSVData = new ArrayList<String>();
	private int numColumns;
	
	public CSVUtilities(File csv) throws IOException
	{
		FileReader csvF = new FileReader(csv);
		
		try (BufferedReader br = new BufferedReader(csvF))
		{
			String line = br.readLine();
			while (line != null)
			{
				String[] attributes = line.split(","); 
				this.CSVData.addAll(Arrays.asList(attributes));
				line = br.readLine();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public List<String> getColumnHeaders()
	{
		ArrayList<String> header = new ArrayList<String>();
		String[] headers = CSVData.get(0).split(",");
		for (int i = 0; i < headers.length; i++)
		{
			header.add(headers[i]);
		}
		return header;
	}
	
	public List<String> getDataString(int column)
	{
		ArrayList<String> data = new ArrayList<String>();
		for (String i : CSVData)
		{
			String[] k = i.split(",");
			data.add(k[column - 1]);
		}
		return data;
	}
	
	public List<Integer> getDataInteger(int column)
	{
		ArrayList<Integer> data = new ArrayList<Integer>();
		int track = 0;
		for (String i : CSVData)
		{
			String[] k = i.split(",");
			data.add(Integer.parseInt(k[track]));
			track++;
		}
		return data;
	}
	
	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> data = new ArrayList<Double>();
		int track = 0;
		for (String i : CSVData)
		{
			String[] k = i.split(",");
			data.add(Double.parseDouble(k[track]));
			track++;
		}
		return data;
	}
}
