package com.javadev.Search;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchWordFromFile {
	
	public static void main(String[] args) throws IOException {
		
		// create the path to store the file location.
		Path path = Paths.get("C:\\Users\\devpatna\\Search.txt").toAbsolutePath();
		
		// create a list to pass the path.
		List<String> list = Files.lines(path).collect(Collectors.toList());
		
		// create a method to take user input
		String searchWord = findWord();
		
		// craete a method to get the result
		getResult(searchWord, list);
	}

	public static void getResult(String searchWord, List<String> list) {
		
		boolean inFile = list.stream().anyMatch(p -> p.equalsIgnoreCase(searchWord));
		
		if(inFile) {
			System.out.println("\nYES, "+searchWord+ " is in the File");
		}else
			System.out.println("\nNO, "+searchWord+ " is not in the File");
	}

	public static String findWord() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String to Search : ");
		String word = scan.nextLine();
		
		scan.close();
		return word;
	}
}
