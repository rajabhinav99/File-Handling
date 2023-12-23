package filehandling;

import java.io.File;
import java.io.IOException;

public class Example1 {
	
	public static void main(String[] args) throws IOException {
		
		File FILE1 = new File("/Users/abhinavraj/Desktop/Selenium/FileHandling/src/filehandling/Coverletter.pdf"); // Specify the filename
		System.out.println("CanExecure operation" +FILE1.canExecute());
		System.out.println("canRead operation" +FILE1.canRead());
		System.out.println("canWrite operation" +FILE1.canWrite());
		System.out.println("getAbsolutePath operation" +FILE1.getAbsolutePath());
		System.out.println("getCanonicalPath operation" +FILE1.getCanonicalPath());
		System.out.println("getName operation" +FILE1.getName());
		System.out.println("length operation" +FILE1.length());
		System.out.println("string operation" +FILE1.toString());
		System.out.println("list operation" +FILE1.list());
		
		
		
	}

}
