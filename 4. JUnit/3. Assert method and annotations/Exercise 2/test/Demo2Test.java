package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {
	@Test
	public void testPalindromeCheck() {
		Demo2 demoObj = new Demo2();
		assertTrue(demoObj.palindromeCheck("racecar"));
		assertTrue(demoObj.palindromeCheck("madam"));
		assertTrue(demoObj.palindromeCheck("mom"));
		assertTrue(demoObj.palindromeCheck("dad"));
		assertTrue(demoObj.palindromeCheck("malayalam"));
	}
}
