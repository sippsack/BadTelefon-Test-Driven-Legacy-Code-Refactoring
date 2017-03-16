package de.oio.refactoring.badtelefon;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * TODO ---- 
 * 1. Rabatt-Klasse mit Prozentsatz (/) 
 * 2. 10 % Rabatt => berechnePreis liefert 90 % vom Preis zurück (/) 
 * 3. kein Rabatt => berechnePreis liefert gleichen Wert zurück (/) 
 * 4. ignoriere negative Rabatte => berechnePreis liefert gleichen Wert zurück
 *
 */
public class RabattTests {
	@Test
	public void testErzeugeRabatt() throws Exception {
		assertNotNull(createRabatt(10));
	}
	
	@Test
	public void testGetProzentsatz() {
		assertEquals(10, createRabatt(10).getProzentsatz());
		assertEquals(20, createRabatt(20).getProzentsatz());
		assertEquals(0, createRabatt(0).getProzentsatz());
	}

	@Test
	public void testBerechne10ProzentRabatt() throws Exception {
		assertEquals(9.0, createRabatt(10).berechneNetto(10.0), 0.001);
	}

	@Test
	public void testBerechnePreisOhneRabatt() throws Exception {
		assertEquals(10.0, createRabatt(0).berechneNetto(10.0), 0.001);
	}

	@Test
	public void testIgnoreNegativenRabatt() throws Exception {
		assertEquals(10.0, createRabatt(-20).berechneNetto(10.0), 0.001);
	}

	
	private Rabatt createRabatt(int zwanzig) {
		return new Rabatt(zwanzig);
	}

}
