package _05_unit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class whatever {

	@Test
	public void test() {
		assertEquals(9, add(5,4));
		assertEquals(489, add(69,420));
	}
	static int add (int x, int y) {
		int z = 0;
		z = x + y;
		return z;
	}
}
