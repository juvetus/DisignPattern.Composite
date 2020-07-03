package fr.doranco.disign.pattern.composite;

public class Tracteur implements Composant {
	
	private int poids;
	
	public Tracteur(int poids) {
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		
		return this.poids;
	}

}
