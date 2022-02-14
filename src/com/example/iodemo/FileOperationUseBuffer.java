  package com.example.iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileOperationUseBuffer {
	
	public static List<String> readFromFile (String quellFileName) throws IOException {
		List<String> lines = new ArrayList<>();
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(quellFileName))) {
			String line = null;
			while ((line = reader.readLine()) != null ) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static void writeToFile (List<String> lines, String targetFileName) throws IOException {
		
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(targetFileName))) {
			for (String line : lines) {
				writer.write(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
	public static void readAndWriteToFile(String quellFileName, String targetFileName) throws IOException {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(quellFileName));BufferedWriter writer = Files.newBufferedWriter(Paths.get(targetFileName), StandardOpenOption.APPEND)) {
			
			String line = null;
			while ((line = reader.readLine())!=null) {
				writer.append(line + "\n");
				// writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
