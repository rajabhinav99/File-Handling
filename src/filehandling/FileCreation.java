package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) throws IOException {
		
		File REF1 = new File("/Users/abhinavraj/Desktop/Selenium/FileHandling/src/filehandling/NewFILE.docx");
		
		// File Creation
		
		System.out.println(REF1.createNewFile());
		
		// Output is true if file is created successfully but if file already exists then output is false
		
		//Folder creation
		
		System.out.println(REF1.mkdir());
	}

}
