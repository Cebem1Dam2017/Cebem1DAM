package com.cebem;
import static org.junit.Assert.*;

import org.junit.Test;

public class DanielPerezNietoTest {

	@Test
	public void testCuentaLetras() {
		String nb = "Daniel";

		assertEquals(6, DanielPerezNieto.cuentaLetras(nb));
	}

	@Test
	public void testPasarMayusculas() {
		String nb = "daniel";

		assertEquals("DANIEL", DanielPerezNieto.pasarMayusculas(nb));
	}

	@Test
	public void testNombreReves() {
		String nb = "daniel";

		assertEquals("leinad", DanielPerezNieto.nombreReves(nb));
	}

}
