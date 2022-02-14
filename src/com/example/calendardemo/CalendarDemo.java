package com.example.calendardemo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import static com.example.iodemo.FileOperationUseBuffer.writeToFile;

import com.example.iodemo.FileOperationUseBuffer;

public class CalendarDemo {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Please input a date with Format dd.mm.yyyy ");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.next();
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Mo.\tDi.\tMi.\tDo.\tFr.\tSa.\tSo.\t");
		System.out.println("Mo.\tDi.\tMi.\tDo.\tFr.\tSa.\tSo.\t");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(inputStr,formatter);
		
		int day = date.getDayOfMonth();
		date = LocalDate.of(date.getYear(), date.getMonth(), 1);
		int weekDay = date.getDayOfWeek().getValue();
		int len = date.lengthOfMonth();
		int count = 0;
		StringBuilder temp = new StringBuilder();
		
		for (int i=1;i<weekDay;i++) {
			System.out.print("\t");
			temp = temp.append("\t");
			count++;
		}
		for (int j=1;j<=len;j++) {
			System.out.print(j+"\t");
			temp = temp.append(j+"\t");
			count++;
			if(count%7==0) {
				list.add(temp.toString());
				temp = temp.delete(0, temp.length());
				System.out.println();
			}
		}
		if (temp.length()!=0) {
			list.add(temp.toString());
		}
		System.out.println(list);
		
		writeToFile(list, "Calendar.txt");

	}
	

}
