package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindName() {
		Employee employee = new Employee();
		ArrayList<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Raj");
		list.add("Abhish");
		list.add("Ramesh");
		list.add("John");
		assertEquals("FOUND", employee.findName(list, "Raj"));
	}


}
