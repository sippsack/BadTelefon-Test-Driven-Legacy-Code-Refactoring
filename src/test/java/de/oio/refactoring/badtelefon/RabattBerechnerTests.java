package de.oio.refactoring.badtelefon;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 *  Kunde erweitern um Rabatt (/)
 *  Kunde mit Rabatt (/)
 *  Kunde ohne Rabatt anlegen (Default)
 *  berechne Preis bei 10 %
 *  berechne Preis, wenn kein Rabatt
 *  ignoriere negative Rabatte
 *  refactor Duplikation in Test 
 *
 */
public class RabattBerechnerTests {
	@Test
	public void testErzeugeKundeMitRabatt() {
		Kunde kunde = new Kunde(Tarif.PROFI, 10);
		assertNotNull(kunde);
		assertEquals(Tarif.PROFI, kunde.tarif.tarif);
	}
	
	@Test
	public void testErzeugeKundeOhneRabatt() throws Exception {
		new Kunde(Tarif.PROFI);
		new Kunde(Tarif.PROFI, 0);
		
	}
	
	@Test
	public void testKundeMit10Prozent() throws Exception {
		Kunde kunde = new Kunde(Tarif.PROFI, 10);
//		assertEquals(9.0, kunde.berechneRabatt(10.0), 0.001);
	}
	
}
