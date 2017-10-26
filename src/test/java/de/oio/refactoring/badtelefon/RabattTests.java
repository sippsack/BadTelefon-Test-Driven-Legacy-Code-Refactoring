package de.oio.refactoring.badtelefon;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * TODO ---- 1. Rabatt-Klasse mit Prozentsatz (/) 2. 10 % Rabatt =>
 * berechnePreis liefert 90 % vom Preis (10 Euro) zurück (/) 3. kein Rabatt =>
 * berechnePreis liefert gleichen Wert (10 Euro) zurück (/) 4. ignoriere
 * negative Rabatte => berechnePreis liefert gleichen Wert zurück 5. 20 % Rabatt
 * => 80 % von 10 Euro 6. 20 % Rabatt => 80 % von 5 Euro
 *
 */
public class RabattTests {
	@Test
	public void testErzeugeRabatt10() throws Exception {
		int prozentsatz = 10;
		Rabatt rabatt = createRabatt(prozentsatz);
		int actualValue = rabatt.getProzentsatz();
		assertEquals(prozentsatz, actualValue);
	}

	@Test
	public void testErzeugeRabatt20() throws Exception {
		int prozentsatz = 20;
		Rabatt rabatt = createRabatt(prozentsatz);
		int actualValue = rabatt.getProzentsatz();
		assertEquals(prozentsatz, actualValue);
	}

	private Rabatt createRabatt(int prozentsatz) {
		Rabatt rabatt = new Rabatt(prozentsatz);
		return rabatt;
	}

	@Test
	public void testBerechne10ProzentRabatt() throws Exception {
		Rabatt rabatt = new Rabatt(10);
		double bruttoPreis = 10.0;
		assertEquals(9.0, rabatt.berechneNetto(bruttoPreis), 0.001);
	}

	@Test
	public void testBerechnePreisOhneRabatt() throws Exception {
		assertEquals(10.0, createRabatt(0).berechneNetto(10.0), 0.001);
	}

	@Test
	public void testIgnoreNegativenRabatt() throws Exception {
		assertEquals(10.0, createRabatt(-20).berechneNetto(10.0), 0.001);
	}

}
