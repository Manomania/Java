package etudiant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author Maxime Martinez
 * @For S.Bonnard
 * @class Etudiant
 * 
 */

public class Etudiant {
	// Init des variables
	private String nom;
	private String prenom;
	private int age;
	private char sexe;
	private ArrayList notes;
	
	public Etudiant (String _nom, String _prenom, int _age, char _sexe, float notes) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.age = _age;
		this.sexe = _sexe;
		this.notes = new ArrayList<Float>();
	}
	public Etudiant() {
		notes.clear();
	}
    public void ajouterNote(int note) {
        notes.add(new Integer(note));
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String _prenom) {
		this.prenom = _prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int _age) {
		this.age = _age;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char _sexe) {
		this.sexe = _sexe;
	}
    public int [] getNotes() {
        // On fait une copie pour protéger la variable membre
        int [] buf = new int [notes.size()];
        int i;
        Iterator it;
        
        for (it = notes.iterator(), i = 0; it.hasNext(); i++) {
            Integer n = (Integer) it.next();
            
            buf[i] = n.intValue();
        }
        return buf;
    }
	// Fin Init des variables
	
	// Faire la moyenne de l'étudiant
	
    public double moyenne() {
        double sum = 0.0;
        
        for (Iterator it = notes.iterator(); it.hasNext();) {
            Integer n = (Integer) it.next();
            sum += n.doubleValue();
        }
        return sum/notes.size();
    }
    
	// Saisie des données de l'étudiant
	public static Etudiant saisieEtudiant(Scanner sset) {
		System.out.println("Saisir un nom : ");
		String _nom = sset.nextLine();
		System.out.println("Saisir un prénom : ");
		String _prenom = sset.nextLine();
		System.out.println("Saisir un âge: ");
		int _age = sset.nextInt();
		sset.nextLine();
		System.out.println("Saisir un sexe : ");
		char _sexe = sset.nextLine().charAt(0);
		System.out.println("Saisir une note : ");
		float notes = sset.nextFloat();
		sset.nextLine();
		return  new Etudiant(_nom, _prenom, _age, _sexe, notes);
	}
	public boolean equals(Etudiant e) {
		return (this.age == e.age && this.nom.equals(e.getNom()) && this.prenom.equals(e.prenom) && e.sexe == this.sexe && this.notes == e.notes);
	}
}