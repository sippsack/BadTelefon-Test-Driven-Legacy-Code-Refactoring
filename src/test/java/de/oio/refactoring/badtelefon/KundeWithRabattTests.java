package de.oio.refactoring.badtelefon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KundeWithRabattTests {

	@Test
	public void testKundeOhneRabatt() {
		Kunde kunde = new Kunde(Tarif.PRIVAT);
		assertEquals(0.0, kunde.getGebuehr(), 0.001);
		kunde.account(2, 12, 30);
		assertEquals(1.99, kunde.getGebuehr(), 0.001);
	}

	@Test
	public void testKundeMit10ProzentRabatt() throws Exception {
		Kunde kunde = new Kunde(Tarif.PRIVAT, new Rabatt(10));
		assertEquals(0.0, kunde.getGebuehr(), 0.001);
		kunde.account(2, 12, 30);
		assertEquals(1.791, kunde.getGebuehr(), 0.001);
	}

	@Test
	public void testKundeMit10ProzentRabattUndSpeichernMock() throws Exception {
		Kunde kunde = new Kunde(Tarif.PRIVAT, new Rabatt(10)) {
			@Override
			protected void saveCall(int minuten, int stunde, int minute, double preis) {
				// nichts tun 
				// oder Werte abprüfen
				assertEquals(1.791, preis, 0.001);
			}
		};
		kunde.account(2, 12, 30);
		assertEquals(1.791, kunde.getGebuehr(), 0.001);
	}

	
}
