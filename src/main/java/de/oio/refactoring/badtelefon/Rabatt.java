package de.oio.refactoring.badtelefon;

public class Rabatt {

	private final int prozentsatz;

	public Rabatt(int prozentsatz) {
		this.prozentsatz = Math.max(prozentsatz, 0);
	}

	public int getProzentsatz() {
		return prozentsatz;
	}


	public double berechneNetto(double brutto) {
		return (100 - prozentsatz) * brutto / 100;
	}
}
