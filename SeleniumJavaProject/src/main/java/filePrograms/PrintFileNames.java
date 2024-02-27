package filePrograms;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GUDDAM\\Downloads";
		
		File file = new File(path);
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		
		for(File e: downloadDir)
		{
			if(e.isFile()) {
				System.out.println("File: " + e.getName());
			}
			
			else if(e.isDirectory()) {
				System.out.println("Directory: " + e.getName());
			}
			else {
				System.out.println("Not known: " + e.getName());
			}	
			}
		}
	}


