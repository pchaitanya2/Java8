package com.dxc.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SteamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Various ways to get Streams
		//getting from collection stream method
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		list.stream();
		/*
		 * Stream<Integer> str=Stream.of(1,2);
		 * 
		 * File file = new File("C:/a.txt"); try { FileInputStream reader=new
		 * FileInputStream(file); Stream.of(file); } catch (FileNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		
		//Stream.of("one", "two", "three", "four").reduce((i,j)->((i+j)));
		 /* .filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e))
		  .map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e))
		  .collect(Collectors.toList());*/
		
		Stream.generate(UUID::randomUUID).limit(5).forEach(System.out::println);;
		
		Function<String, Integer> keyExtractor = str -> str.length();
		Stream.of("grapes", "milk", "pineapple", "water-melon")
		.sorted(Comparator.comparing(keyExtractor))
		.forEach(System.out::println);
		
	//	Comparator<Integer> c= (s1, s2) -> keyExtractor.apply(s1).
	//	compareTo(keyExtractor.apply(s2));
		
		//System.out.println(Stream.of("java", ".net", "python").collect(Collectors.joining(",")));
		
		System.out.println(Stream.of("java", ".net", "python").collect(Collectors.joining(", ", "Joined String[ ", " ]")));
	}

}
