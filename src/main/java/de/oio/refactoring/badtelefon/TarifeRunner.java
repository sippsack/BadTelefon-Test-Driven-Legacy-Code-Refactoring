package de.oio.refactoring.badtelefon;

import java.util.Arrays;

public class TarifeRunner {
	public static void main(String args[]) {
		for(Integer tarif : Arrays.asList(Tarif.PRIVAT, Tarif.BUSINESS, Tarif.PROFI)) {
			System.out.println(String.format("\nVerarbeitung von Tarif %s", tarif));
			Kunde k = new Kunde(tarif);
			
			k.account(10, 12, 30);
			k.account(1, 9, 45);
			k.account(3, 18, 0);
			k.account(2, 17, 45);
			k.account(6, 23, 30);
			
			System.out.println("Abrechnung: " + k.getGebuehr());
		}
	}
}
