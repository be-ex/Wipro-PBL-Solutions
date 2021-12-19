package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {
	@Test
	public void testStringConcat() {
		Demo1 demoObj = new Demo1();
		assertEquals("RaceCar", demoObj.StringConcat("Race", "Car"));
	}
}
