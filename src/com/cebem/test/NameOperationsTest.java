package com.cebem.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cebem.NameOperations;

public class NameOperationsTest {

	@Test
	public void testPrintName() {
		NameOperations name = new NameOperations();
		String n;
		n = "Borja";
		assertEquals("Borja", name.printName(n));
	}

	@Test
	public void testCountString() {
		NameOperations name = new NameOperations();
		String n;
		n = "Borja";
		assertEquals(5, name.countString(n));
	}

	@Test
	public void testUppercaseName() {
		NameOperations name = new NameOperations();
		String n;
		n = "Borja";
		assertEquals("BORJA", name.uppercaseName(n));
	}

	@Test
	public void testTurnName() {
		NameOperations name = new NameOperations();
		String n;
		n = "Borja";
		assertEquals("ajroB", name.turnName(n));
	}

}
