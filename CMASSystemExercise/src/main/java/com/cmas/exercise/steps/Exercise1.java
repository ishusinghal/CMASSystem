package com.cmas.exercise.steps;

import java.util.stream.IntStream;

public class Exercise1 {
	
	public static String MULTIPLE_3="CMAS";
	public static String MULTIPLE_5="systems";
	public static String MULTIPLE_15="CMASsystems";
	
	public static void main(String[] args) {
		cmasPrintExercise(1, 21);
	}

	public static String cmasPrintExercise(int start, int end) {
		StringBuffer sb = new StringBuffer();
		IntStream str  = IntStream.range(start, end);
		str.forEach( x -> {
			sb.append(printDivisibleByNumber(x));
		});
		sb.append(".");
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static String printDivisibleByNumber(int no) {
		StringBuffer sb = new StringBuffer();
		if(no%15==0) {
			sb.append(MULTIPLE_15).append(" ");	
		}else if(no%3==0) {
		sb.append(MULTIPLE_3).append(" ");
		}
		else if(no%5==0) {
		sb.append(MULTIPLE_5).append(" ");	
		}else 
		sb.append(no).append(" ");
		return sb.toString();
	}
	
}
