package Uebungsblatt6Bsp2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
	
	//private String path;
	private File file;

	public Logger(String path) {
		super();
		
		file=new File(path);
		}
	 

	private void logMessage(errorMessage message) throws IOException
	{
		try
		(FileWriter fw=new FileWriter(file,true);PrintWriter pw=new PrintWriter(fw))
		{
			pw.println(message.toLine());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void logFatal(String message) throws IOException
	{
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		errorMessage error=new errorMessage("FATAL", message, timeStamp);
		
		logMessage(error);
		System.out.println(file);
	}

	public void logError(String message) throws IOException
	{
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		errorMessage error=new errorMessage("ERROR", message, timeStamp);
		
		logMessage(error);
		System.out.println(file);
	}
	
	public void logInfo(String message) throws IOException
	{
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		errorMessage error=new errorMessage("INFO", message, timeStamp);
		
		logMessage(error);
		System.out.println(file);
	}
	
	public void logDebug(String message) throws IOException
	{
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		errorMessage error=new errorMessage("DEBUG", message, timeStamp);
		
		logMessage(error);
		System.out.println(file);
	}
}
