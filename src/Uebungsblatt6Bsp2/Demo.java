package Uebungsblatt6Bsp2;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		Logger error=new Logger("C:\\temp\\error.txt");
		try {
			error.logError("to hot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			error.logError("Application shutdown");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
