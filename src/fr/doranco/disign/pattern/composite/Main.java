package fr.doranco.disign.pattern.composite;

public class Main {

	public static void main(String[] args) {
     
		Remorque maRemorque = new Remorque(11);
		System.out.println("Le poid de la remorque est : " + maRemorque.getPoids()+ " tonnes");
		
		Tracteur monTracteur = new Tracteur(8);
		System.out.println("Le poids de mon tracteur est : " + monTracteur.getPoids()+ " tonnes");
		
		CamionComposite semiRemorque = new CamionComposite();
		semiRemorque.add(maRemorque);
		semiRemorque.add(monTracteur);
		
		System.out.println("Le poids de mon semi-remorque est : " + semiRemorque.getPoids() + " tonnes");
	}

}
