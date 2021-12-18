package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 demoObj = new Demo1();
		assertEquals("RaceCar", demoObj.StringConcat("Race", "Car"));
		//assertEquals("Race Car", demoObj.StringConcat("Race", "Car"));
	}
}
