package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//C:\temp\in.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<LogEntry> set = new HashSet<LogEntry>();
			
			String line;
			
			while((line = br.readLine()) != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment));
			}
			
			System.out.println("Total users: " + set.size());
		}
		catch (IOException ioe) {
			System.out.println("IO Error: " + ioe.getMessage());
		}
		
		sc.close();
	}

}
