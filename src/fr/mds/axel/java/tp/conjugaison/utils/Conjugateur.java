package fr.mds.axel.java.tp.conjugaison.utils;

import java.util.Scanner;

public class Conjugateur {
	
	private static final String[] pronoms = { "Je", "Tu", "Il/Elle", "Nous", "Vous", "Ils/Elles" };	
	private static final String[] terminaisons = { "e", "es", "e", "ons", "ez", "ent" };
	
	public static void conjuguer(String verbe) {
		System.out.println("\nVerbe " + verbe + " conjuguer au présent de l'indicatif : \n");
		verbe = verbe.substring(0, verbe.length() - 2);
		
		for(int i = 0; i < pronoms.length; i++) {
			System.out.println(pronoms[i] + " : " + verbe + terminaisons[i]);
		}
	}
	
	public static void conjugueAvecSaisi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nVeuillez saisir un verbe du premier groupe non irrégulier : ");
		String verbe = sc.nextLine();
		
		conjuguer(verbe);
		
		sc.close();
	}

}
