package de.oio.refactoring.badtelefon;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * TODO
 * ----
 * 1. Rabatt-Klasse mit Prozentsatz (10 %) (/)
 * 2. 10 % Rabatt => berechnePreis liefert 90 % vom Preis (10 Euro) zurück (/)
 * 3. kein Rabatt => berechnePreis liefert gleichen Wert (10 Euro) zurück (/)
 * 4. 20 % Rabatt => berechnePreis liefert 80 % vom Preis (5 Euro) zurück (/)
 * 4. ignoriere negative Rabatte => berechnePreis liefert gleichen Wert (10 Euro) zurück
 * 5. ignoriere Rabatte größer 100 => berechnePreis liefert gleichen Wert (10 Euro) zurück
 */
public class RabattTests {

	@Test
	public void testErzeugeRabatt() throws Exception {
		assertEquals(10, createRabatt(10).getProzentsatz());
	}
	
	@Test
	public void testBerechne10ProzentRabatt() throws Exception {
		assertEquals(9.0, createRabatt(10).berechneNetto(10.0), 0.001);
	}

	private Rabatt createRabatt(int rabatt) {
		return new Rabatt(rabatt);
	}

	@Test
	public void testBerechnePreisOhneRabatt() throws Exception {
		assertEquals(10.0, createRabatt(0).berechneNetto(10.0), 0.001);
	}


}
