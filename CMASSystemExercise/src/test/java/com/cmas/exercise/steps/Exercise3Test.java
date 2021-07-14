package com.cmas.exercise.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Exercise3Test {

	private static final String OUTPUT_STRING = "1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems ";
	public static String MULTIPLE_3="CMAS";
	public static String CONTAINS_3 = "good";
	public static String MULTIPLE_5="systems";
	public static String MULTIPLE_15="CMASsystems";
	
	Exercise3 exercise3 = mock(Exercise3.class);
	
	@Test
	public void testDivisibleBy3() {
		assertEquals(CONTAINS_3+ " ", Exercise3.printDivisibleByNumber(3));
	}
	
	@Test
	public void testDivisibleBy5() {
		assertEquals(MULTIPLE_5+ " ", Exercise3.printDivisibleByNumber(5));
	}
	
	@Test
	public void testDivisibleBy15() {
		assertEquals(MULTIPLE_15+ " ", Exercise3.printDivisibleByNumber(15));
	}
	
	@Test
	public void testNotDivisibleByMultiple() {
		assertEquals("7"+ " ", Exercise3.printDivisibleByNumber(7));
	}
	
	@Test
	public void testNotDivisibleContains3() {
		assertEquals(CONTAINS_3+ " ", Exercise3.printDivisibleByNumber(13));
	}
	
	@Test
	public void testCmasPrintExercise() {
		assertEquals(OUTPUT_STRING, Exercise3.cmasPrintExercise(1, 21));
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testSplitAndPrintWordTimesFor3() {
		verify(exercise3, times(1)).splitAndPrintWordTimes("");
	}
	
	
}
