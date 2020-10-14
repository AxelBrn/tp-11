package fr.mds.axel.java.tp.conjugaison;

import fr.mds.axel.java.tp.conjugaison.utils.Conjugateur;

public class Application {

	public static void main(String[] args) {
		String[] verbes = { "manger", "chanter" };
		
		for(String verbe : verbes) {
			Conjugateur.conjuguer(verbe);
		}
		Conjugateur.conjugueAvecSaisi();
	}

}
