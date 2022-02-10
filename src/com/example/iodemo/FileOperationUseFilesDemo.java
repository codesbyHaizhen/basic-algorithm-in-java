package com.example.iodemo;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileOperationUseFilesDemo {
	
	public static void main(String... args) {
		try(Stream<String> input = Files.lines(Paths.get("quell.txt")); PrintWriter output = new PrintWriter("target.txt")) {
			input.map(s->s.toUpperCase()).forEachOrdered(s->output.println(s));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
