package com.example.calendardemo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import static com.example.iodemo.FileOperationUseBuffer.writeToFile;

/**
 * Class for get a month calendar from the inputed date and save it in a text file
 * 
 * @author haizhen
 *
 */

public class CalendarDemo {
	
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<String> list = new ArrayList<>();
	private String inputStr;
	
	public static void main(String[] args) throws IOException {
		new CalendarDemo();
	}

	private CalendarDemo() throws IOException {
		input();
		process();
		output();
	}
	
	private void input() {
		System.out.println("Please input a date with Format dd.mm.yyyy ");
		
		inputStr = scanner.next();
		scanner.close();
	}
	
	private void output() throws IOException {
		writeToFile(list, "Calendar.txt");
	}
	
	private void process() {
		list.add("Mo.\tDi.\tMi.\tDo.\tFr.\tSa.\tSo.\t");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(inputStr,formatter);
		
		date = LocalDate.of(date.getYear(), date.getMonth(), 1);
		int weekDay = date.getDayOfWeek().getValue();
		int len = date.lengthOfMonth();
		int count = 0;
		StringBuilder temp = new StringBuilder();
		
		for (int i=1;i<weekDay;i++) {
			temp = temp.append("\t");
			count++;
		}
		for (int j=1;j<=len;j++) {
			temp = temp.append(j+"\t");
			count++;
			if(count%7==0) {
				list.add(temp.toString());
				temp = temp.delete(0, temp.length());
			}
		}
		if (temp.length()!=0) {
			list.add(temp.toString());
		}
	}
}
