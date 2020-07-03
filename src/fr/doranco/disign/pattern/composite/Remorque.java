package fr.doranco.disign.pattern.composite;

public class Remorque implements Composant{
	
	private int poids;
	
	public Remorque(int poids) {
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		
		return this.poids;
	}

}
