package com.cmas.exercise.steps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise3 {

	public static String MULTIPLE_3 = "CMAS";
	public static String CONTAINS_3 = "good";
	public static String MULTIPLE_5 = "systems";
	public static String MULTIPLE_15 = "CMASsystems";

	public static void main(String[] args) {
		cmasPrintExercise(1, 21);
	}

	public static String cmasPrintExercise(int start, int end) {
		StringBuffer sb = new StringBuffer();
		IntStream str = IntStream.range(start, end);
		str.forEach(x -> {
			sb.append(printDivisibleByNumber(x));
		});
		System.out.println(sb.toString());
		splitAndPrintWordTimes(sb.toString());

		return sb.toString();
	}

	public static void splitAndPrintWordTimes(String outputString) {
		String[] str = outputString.split(" ");
		System.out.println(MULTIPLE_3 + ": " + Arrays.asList(str).stream().filter(x -> x.equals(MULTIPLE_3)).count());
		System.out.println(MULTIPLE_5 + ": " + Arrays.asList(str).stream().filter(x -> x.equals(MULTIPLE_5)).count());
		System.out.println(MULTIPLE_15 + ": " + Arrays.asList(str).stream().filter(x -> x.equals(MULTIPLE_15)).count());
		System.out.println(CONTAINS_3 + ": " + Arrays.asList(str).stream().filter(x -> x.equals(CONTAINS_3)).count());

		System.out.println("integer" + ": " + Arrays.asList(str).stream()
				.filter(x -> !List.of(MULTIPLE_3, MULTIPLE_5, MULTIPLE_15, CONTAINS_3).contains(x)).count());

	}

	public static String printDivisibleByNumber(int no) {
		StringBuffer sb = new StringBuffer();
		 if (String.valueOf(no).contains("3")) {
			sb.append(CONTAINS_3).append(" ");
		}else if (no % 15 == 0) {
			sb.append(MULTIPLE_15).append(" ");
		}
		 else if (no % 3 == 0) {
			sb.append(MULTIPLE_3).append(" ");
		} else if (no % 5 == 0) {
			sb.append(MULTIPLE_5).append(" ");
		} else
			sb.append(no).append(" ");
		return sb.toString();
	}

}