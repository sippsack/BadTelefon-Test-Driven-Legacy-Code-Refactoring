package de.oio.refactoring.badtelefon;

public class Rabatt {

	private final int prozentsatz;

	public Rabatt(int prozentsatz) {
		this.prozentsatz = Math.max(0, prozentsatz);
	}

	public int getProzentsatz() {
		return prozentsatz;
	}

	public double berechneNetto(double bruttoPreis) {
		return (100 - prozentsatz) * bruttoPreis / 100;
	}

}
