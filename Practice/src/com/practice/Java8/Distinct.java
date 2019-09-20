package com.practice.Java8;

import java.util.stream.IntStream;

public class Distinct {
	public static void main(String args[]) {
		// Distinct() it is a stateful intermediate operation
		// It may incorporate state from previously seen elements
		// when processing new elements
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9);
		intStream.distinct().filter(p -> (p % 3 == 0)).skip(0).forEach(System.out::println);
	}
}
