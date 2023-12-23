package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDelete {
	
	public static void main(String[] args) throws IOException {
		
			File REF1 = new File("/Users/abhinavraj/Desktop/Selenium/FileHandling/src/filehandling/NewFILE.docx");
		
		// File Creation
		
		if(REF1.delete())
		{
			System.out.println("File delete successfully");
		}
		else
		{
			System.out.println("File deletion failed ");
		}
		
		
		
		//Folder detetion
		/*
			File REF1 = new File("/Users/abhinavraj/Desktop/Selenium/FileHandling/src/filehandling/");
		
		// File Creation
		
		if(REF1.delete())
		{
			System.out.println("All File deleted successfully");
		}
		else
		{
			System.out.println("All File deleted failed ");
		}
		 */
		
	}

}
