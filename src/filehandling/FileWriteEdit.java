package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEdit {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter REF1 = new FileWriter("/Users/abhinavraj/Desktop/Selenium/FileHandling/src/filehandling/NewFILE.docx");
		REF1.write("Java is a high level programming language");
		REF1.close();
		
		System.out.println("Sucessfully executed");
		
		
		}
	
	

}
