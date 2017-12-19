import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities 
{
	private ArrayList<String> CSVData = new ArrayList<String>();
	private int numColumns;
	private File csv;
	
	public CSVUtilities(File csv)
	{
		this.csv = csv;
		this.numColumns = 12;
	}
	
	public List<String> getColumnHeaders()
	{
		for (int i = 0; i < numColumns; i++)
		{
			
		}
	}
	
	public List<String> getData(int column)
	{
		
	}
	
	public List<Integer> getData(int column)
	{
		
	}
	
	public List<Double> getData(int column)
	{
		
	}
}
