package models;

public class Enclos {
    private int taille;
    private Animal[] contenu;

    public Enclos(int taille) {
        this.taille = taille;
        this.contenu = new Animal[taille];
    }

    public void ajouterAnimaux(Animal animalAjoute) {
        for (int i = 0; i < contenu.length; i++) {
            if (contenu[i] == null) {
                if (i == 0) {
                    contenu[i] = animalAjoute;
                    animalAjoute.setEstMis(true);
                } else {
                    if (animalAjoute.getestHerbivore() == contenu[0].getestHerbivore()) {
                        contenu[i] = animalAjoute;
                        animalAjoute.setEstMis(true);
                    }
                }
                break;
            }
        }
    }

    public Animal[] getContenu() {
        return contenu;
    }

    public int getTaille() {
        return taille;
    }
}
