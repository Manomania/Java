package etudiant;

import java.util.ArrayList;
import java.util.Scanner;

public class Promo {
	protected static float moyenne;
	private String nom;
	private int annee;
	private ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
	
	public Promo() {
		liste.clear();
	}
	public void add(Etudiant edd) {
		liste.add(edd);
	}
	public void delete(Etudiant edd) {
		liste.remove(liste.indexOf(edd));
	}	
	public ArrayList<Etudiant> getListe() {
		return liste;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public void setListe(ArrayList<Etudiant> liste) {
		this.liste = liste;
	}

	// Affichage du menu
	public int afficherMenu(Scanner sc) {
		System.out.println("1 : Ajouter Etudiant");
		System.out.println("2 : Supprimer un etudiant");
		System.out.println("3 : Afficher moyenne promo");
		System.out.println("4 : Stop");
		int choix = sc.nextInt();
		sc.nextLine();
		return choix;
	}
	
	// Ajouter un étudiant
	public void ajoutEtudiant(Scanner sc) {
		Etudiant e = Etudiant.saisieEtudiant(sc);
		this.liste.add(e);
	}
	// Chercher l'étudiant pour le supprimer ou l'éditer
	public Etudiant TEtudiant(Etudiant e ) {
		for (Etudiant etudiant : liste) {
			if(e.equals(etudiant)) return etudiant;
		}
		return null;
	}
	// Supprimer un étudiant
	public void suppEtudiant(Scanner sc) {
		Etudiant e = Etudiant.saisieEtudiant(sc);
		Etudiant edutianttrouve = TEtudiant(e);
		if(edutianttrouve  != null) {
			this.liste.remove(edutianttrouve);
			System.out.println("Etudiant supprimé");
		}else {
			System.out.println("Etudiant introuvable");
		}
	}
	// Afficher une moyenne
	/**
	public double Moyenne(Scanner sc) {
		moyenne = 0;
		for (Etudiant etudiant : this.liste) {
			moyenne += etudiant.getNotes();
		}
		moyenne = moyenne/liste.size();
		return moyenne;
	}
	*/
}
