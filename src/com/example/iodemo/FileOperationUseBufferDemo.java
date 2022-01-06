package com.example.iodemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperationUseBufferDemo {

	public static void main(String[] args) throws IOException {
		
		String quellFileName = "quell.txt";
		String targetFileName = "target.txt";
		
		List<String> lines = new ArrayList<>();
		lines = Arrays.asList("this is line 1", "this is line 2", "this is line 3");
		FileOperationUseBuffer.writeToFile(lines, quellFileName);
		
		FileOperationUseBuffer.readAndWriteToFile(quellFileName, targetFileName);
		
		lines = FileOperationUseBuffer.readFromFile(targetFileName);
		
		System.out.println(lines);
		
		

	}

}
