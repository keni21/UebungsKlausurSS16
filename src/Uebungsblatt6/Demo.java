package Uebungsblatt6;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws AddressLoadException, IOException {
		AddressManager manager=new AddressManager();
		try {
			manager.loadFromCsv("C:\\temp\\csv1.txt", "_");
		} catch (AdressLoadWrongFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			manager.exportToCsv("C:\\temp\\csv6.txt", ";");
		} catch (AddressExportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
