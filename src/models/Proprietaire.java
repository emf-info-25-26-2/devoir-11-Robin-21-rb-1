package models;

public class Proprietaire {
    private String prenom;
    private String nom;
    private Animal[] animaux;

    public Proprietaire(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.animaux = new Animal[0];
    }

    public void ajouterAnimaux(Animal animalAjoute) {
        animalAjoute.setProprietaire(this);
        Animal[] newAnimaux = new Animal[animaux.length + 1];
        for (int i = 0; i < newAnimaux.length; i++) {
            if (i == newAnimaux.length - 1) {
                newAnimaux[i] = animalAjoute;
            } else {
                newAnimaux[i] = animaux[i];
            }
        }
        this.animaux = newAnimaux;
        for (int i = 0; i < newAnimaux.length; i++) {
            animaux[i] = newAnimaux[i];
        }
    }

    public void afficheAnimaux() {
        for (int i = 0; i < animaux.length; i++) {
            System.out.println(animaux[i]);
        }
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
