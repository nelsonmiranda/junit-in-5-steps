package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@AfterEach
	public void after() {
		System.out.println("After Each");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After All");
	}

	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before All");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before Each");
	}

	@Test
	void sum() {
		System.out.println("Test");
		MyMath myMath = new MyMath();
		assertEquals(50, myMath.sum(new int[] { 10, 25, 15 }));
	}

}
