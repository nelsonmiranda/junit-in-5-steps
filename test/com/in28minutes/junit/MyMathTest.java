package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void sum() {
		MyMath myMath = new MyMath();
		assertEquals(50, myMath.sum(new int[] {10,25,15}));
	}

}
