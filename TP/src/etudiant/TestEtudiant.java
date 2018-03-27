package etudiant;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import etudiant.Etudiant;
import etudiant.Promo;

public class TestEtudiant {
	static Promo promo = new Promo();
	static Etudiant etudiant = new Etudiant();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nom de la promo : ");
		promo.setNom(sc.nextLine());
		System.out.println("Saisir l'année de la promo : ");
		promo.setAnnee(sc.nextInt());
		sc.nextLine();
		int Menu = 0;
		do {
			Menu = promo.afficherMenu(sc);
			switch(Menu) {
			case 1 : 
				promo.ajoutEtudiant(sc);
				break;
			case 2 : 
				promo.suppEtudiant(sc);
				break;
			case 3 :
				etudiant.moyenne();
				break;
			default: 
				System.out.println("Erreur");
				break;
			}
		} while (Menu != 4);
	}
}