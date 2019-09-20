package com.practice.Java8;

import java.util.stream.IntStream;

public class ConcatMethod {
public static void main(String args[]) {
	IntStream firstStream = IntStream.of(1, 2, 3, 4, 5);
	IntStream secondStream = IntStream.of(1, 2, 3, 4, 5);
	IntStream thirdStream = IntStream.of(1, 2, 3, 4, 5);
	System.out.println(firstStream.summaryStatistics());// this is summary Statistics
	IntStream.concat(thirdStream, IntStream.concat(firstStream, secondStream)).distinct().forEach(System.out::print);
}
}