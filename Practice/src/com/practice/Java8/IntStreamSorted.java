package com.practice.Java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamSorted {
	public static void main(String args[]) 
	{
		// it is a stateful intermidiate  operation
		// stateful intermediate operation may need to process the entire input before 
		// producing result
			IntStream intStre = IntStream.generate(() -> (int)Math.random()*89765).limit(5);
			intStre.sorted().forEachOrdered(System.out::println);
			Stream.Builder<String> builder = Stream.builder();
			Stream<String> stream = builder.add("Amit").add("Anand").add("Archna").build();
			stream.map(String::toLowerCase).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
 