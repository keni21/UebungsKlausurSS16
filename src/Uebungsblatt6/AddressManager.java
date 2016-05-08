package Uebungsblatt6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressManager 
{
	
	private ArrayList<Address> list=new ArrayList<>();

	public ArrayList<Address> getList() {
		return list;
	}
	
	public void loadFromCsv(String path, String seperator) throws AddressLoadException, IOException, AdressLoadWrongFormatException
	{
		File file=new File(path);
		
		try
		(FileReader fr=new FileReader(file);BufferedReader br=new BufferedReader(fr))// öffnet und schließt bufferdreader
		{
		
			String line;// hier wird später unsere line geschrieben
			while((line=br.readLine())!=null)// solange ienlesen bis keine zeile mer vorhanden ist
			{
				String[]columns=line.split(seperator);//splitet die Zeile bei "x" zeichen un schreibt es auf ein Strin array
				if(columns.length!=4)
				{
					throw new AdressLoadWrongFormatException("Csv Datei hat falsches Format");
				}
				Address a=new Address(columns[0], columns[1], columns[2], columns[3]);//baut eine Element vom Typ Address mit denn zuvor erstellen Strin[]
				list.add(a);//added die liste
			}
		
		}
		
	}
	
	public void exportToCsv(String path, String seperator) throws AddressExportException, IOException
	{
		File file=new File(path);
		
		try
		(FileWriter fw=new FileWriter(file);PrintWriter pw=new PrintWriter(fw))
		{
			String line;
			for (Address address : list) {
				
				line= address.toString();// schreibt unsere address werte auf die String line mithilfe der TOSTRING :D:D:D:D
				String[] array=line.split(",");//splitet bei ","
				
				for (int i=0;i<array.length;i++)//läuft solange das array durch bis es am ende ist
				{
					if(i<=array.length-2)// umm den letzten seperatur zu verhindern 
					{
						pw.print(array[i]+seperator);
					}
					else pw.print(array[i]);
				}
				pw.println();
			}
		}
	}
		
}


