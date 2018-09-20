package de.oio.refactoring.badtelefon;

public class Rabatt {

	private int prozentsatz;

	public Rabatt(int prozentsatz) {
		this.prozentsatz = prozentsatz;
	}

	public int getProzentsatz() {
		return prozentsatz;
	}

	public double berechneNetto(double brutto) {
		return (100 - prozentsatz) * brutto / 100;
	}

}
