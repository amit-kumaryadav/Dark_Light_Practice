package com.practice.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stream1 {
public static void main(String args[]) {
	List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 3));
	System.out.println(intList.stream().anyMatch(n -> (n%2 == 0)));//This is a short-circuiting terminal operation
	// Which Returns true if given predicate find any match, return false if not found any result based on give predicate
	//anyMatch() function to check whether any element in list having UpperCase at 1st index.
	List<String> strList = new ArrayList(Arrays.asList("amit","anand","Qrchna"));
	System.out.println(strList.stream().anyMatch(s -> Character.isUpperCase(s.charAt(0))));
}
}
