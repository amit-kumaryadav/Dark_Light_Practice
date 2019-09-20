package com.practice.Java8;
import java.util.OptionalInt;
import java.util.stream.*;
public class MaxAndMin {
public static void main(String args[]) {
	IntStream intStream = IntStream.of(1,2,3,4,5);
	OptionalInt maxValue = intStream.max();
	if(maxValue.isPresent())
		System.out.println(maxValue.getAsInt());
	IntStream intStream1 = IntStream.of(1,2,3,4,5);
	OptionalInt minimumValue = intStream1.min();
	if(minimumValue.isPresent())
		System.out.println(minimumValue.getAsInt());
}
}
