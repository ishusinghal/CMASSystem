package com.cmas.exercise.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cmas.exercise.steps.Exercise2;


@SpringBootTest
public class Exercise2Test {

	public static String MULTIPLE_3="CMAS";
	public static String CONTAINS_3 = "good";
	public static String MULTIPLE_5="systems";
	public static String MULTIPLE_15="CMASsystems";
	
	@Test
	public void testDivisibleBy3() {
		assertEquals(CONTAINS_3+ " ", Exercise2.printDivisibleByNumber(3));
	}
	
	@Test
	public void testDivisibleBy5() {
		assertEquals(MULTIPLE_5+ " ", Exercise2.printDivisibleByNumber(5));
	}
	
	@Test
	public void testDivisibleBy15() {
		assertEquals(MULTIPLE_15+ " ", Exercise2.printDivisibleByNumber(15));
	}
	
	@Test
	public void testNotDivisibleByMultiple() {
		assertEquals("7"+ " ", Exercise2.printDivisibleByNumber(7));
	}
	
	@Test
	public void testNotDivisibleContains3() {
		assertEquals(CONTAINS_3+ " ", Exercise2.printDivisibleByNumber(13));
	}
	
	@Test
	public void testcmasPrintExercise() {
		assertEquals("1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems .", Exercise2.cmasPrintExercise(1, 21));
	}
	
}
