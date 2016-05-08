package Uebungsblatt5_IO;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class X {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\temp\\test.txt");
		FileOutputStream fos=new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int data=0;
		while((data=System.in.read())!=-1)
		{
			if(data=='x')
			{
				break;
			}
			bos.write(data);
		}
		bos.close();
		bos.flush();
		
		
	}

}
