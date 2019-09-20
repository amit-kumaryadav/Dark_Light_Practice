package com.practice.Java8;
import java.util.stream.*;
public class noneMatch {
public static void main(String args[]) {
	Stream<String> streamOfString = Stream.of("Amit", "Anand", "Archana");
	// boolean noneMatch(Predicate<? super T> predicate)
	System.out.println(streamOfString.noneMatch(str -> Character.isLowerCase(str.charAt(0))));//noneMatch is short-circuiting terminal operation which means it
	//terminate in finite time with infinte input.
}
}
