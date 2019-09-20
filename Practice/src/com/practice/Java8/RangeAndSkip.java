package com.practice.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RangeAndSkip {
	public static void main(String args[]) {
		IntStream.range(0, 5).skip(3).forEach(System.out::println);;
		List<Integer> list = new ArrayList<Integer>(); 
		  
        list.add(1); 
        list.add(5); 
        list.add(6); 
        list.add(7); 
        list.add(8); 
        list.add(9); 
        list.add(10);// we want to sum of given list where no is greater than 5
        System.out.println(list.stream().filter(p -> p >5).mapToInt(i -> i).sum());
	}
}
