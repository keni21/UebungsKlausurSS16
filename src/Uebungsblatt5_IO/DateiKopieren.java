package Uebungsblatt5_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateiKopieren {

	public static void main(String[] args) throws IOException {
		
		File filein=new File("C:\\temp\\test.txt");
		File fileout=new File("C:\\temp\\testout.txt");
		
		FileInputStream fis=new FileInputStream(filein);
		FileOutputStream fos=new FileOutputStream(fileout);
		
		int data=0;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			System.out.println(data);
		}
		
		fis.close();
		fos.close();
		
		fos.flush();

	}

}
