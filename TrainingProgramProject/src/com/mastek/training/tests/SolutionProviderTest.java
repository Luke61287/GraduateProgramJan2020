package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.basics.SolutionProvider;

class SolutionProviderTest {

	@Test
	void testGetMaxNumberValidParams() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(10,SolutionProvider.getMaxNumber(10, 2),"Invalid Max Number returned");
	}
	
	@Test
	void testGetMaxNumberEqualsParams() {
		assertEquals(9,SolutionProvider.getMaxNumber(9, 9),"Invalid Max Number returned");
	}
	
	@Test
	void testGetMaxNumberEqualNegativeValueParams() {
		assertEquals(-2,SolutionProvider.getMaxNumber(-110, -2),"Invalid Max Number returned");
	}
	
	@Test
	void testGetMaxNumberEqualMaxLimitsForIntParams() {
		assertEquals(999999999,SolutionProvider.getMaxNumber(999999999, 2),"Invalid Max Number returned");
	}
	
	@Test
	void testGetMaxDivisibleValidParams() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals("2,0",SolutionProvider.getDivisionNumber(10, 5),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxMiles() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(1,SolutionProvider.getMiles(1.61),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxAreaRectangle() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(10,SolutionProvider.getAreaRectangle(2, 5),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxAreaSquare() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(25,SolutionProvider.getAreaSquare(5, 5),"Answer is invalid ");
	}

	@Test
	void testGetMaxJourneyTime() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(2,SolutionProvider.getJourneyTime(10, 5),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxCircumference() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(78.53981633974483,SolutionProvider.getCircumference(5),"Answer is invalid ");
	}
	
	@Test
	void testGetMin() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals(4,SolutionProvider.min(5, 6, 4),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxMarks() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals("Pass",SolutionProvider.getMarks(1, "Luke Mellor", 24, 30, 40, 20),"Answer is invalid ");
	}
	
	@Test
	void testGetMaxGrade() { // assert<conditions>(<Expected-Result>, <call the function for actual Result>, 
		// <Message to display if Expected Result does not match Actual result>);
		assertEquals("A-",SolutionProvider.getGrade(1, "Luke Mellor", 24, 100, 50, 60),"Answer is invalid ");
	}

}