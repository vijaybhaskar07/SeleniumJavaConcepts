package filePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		File ipFile = new File("C:\\Users\\GUDDAM\\Downloads\\AutomationResume_Vijay.pdf");
		File opFile = new File("C:\\Users\\GUDDAM\\Downloads\\AutomationResume_Vijay-copy.pdf");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(ipFile);
			fileOutputStream = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		int i=0;
		
		try {
			while((i=fileInputStream.read())!= -1) {
				fileOutputStream.write(i);
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		finally {
			
			if(fileInputStream !=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
			
			if(fileOutputStream !=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {				
					e.printStackTrace();
				}
			}
		}
	

	}

}
