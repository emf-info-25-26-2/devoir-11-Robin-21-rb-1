package app;

import models.Animal;
import models.Type;
import models.Enclos;
import models.Proprietaire;

public class Application {
    public static int compteur = 0;

    public static void main(String[] args) {

        Enclos[] enclos = new Enclos[8];

        for (int i = 0; i < enclos.length; i++) {
            enclos[i] = new Enclos(8);
        }

        Proprietaire[] proprietaires = new Proprietaire[4];
        proprietaires[0] = new Proprietaire("Mario", "Duprévert");
        proprietaires[1] = new Proprietaire("Paul", "Duchampsec");
        proprietaires[2] = new Proprietaire("Fred", "Dupaturage");
        proprietaires[3] = new Proprietaire("Tom", "Delaprairie");

        for (int i = 0; i < proprietaires.length; i++) {
            int j = 0;
            while (j != 10) {
                Animal lAnimal = genereAnimaux();
                for (int h = 0; h < enclos.length; h++) {
                    if (lAnimal.getEstMis() == false) {
                        enclos[h].ajouterAnimaux(lAnimal);
                    }
                }
                proprietaires[i].ajouterAnimaux(lAnimal);
                j++;
            }
        }
        for (int i = 0; i < enclos.length; i++) {
            System.out.println("Contenu de l'enclos N°" + (i + 1));
            for (int j = 0; j < enclos[i].getContenu().length; j++) {
                if (enclos[i].getContenu()[j] != null) {
                    System.out.println("    " + enclos[i].getContenu()[j]);
                }
            }
        }
    }

    public static Animal genereAnimaux() {
        int test = (int) (Math.random() * (6 - 1 + 1)) + 1;
        Type type = null;
        switch (test) {
            case 1:
                type = Type.Cheval;
                break;
            case 2:
                type = Type.Chien;
                break;
            case 3:
                type = Type.Chèvre;
                break;
            case 4:
                type = Type.Porc;
                break;
            case 5:
                type = Type.Poule;
                break;
            case 6:
                type = Type.Vache;
                break;
            default:
                break;
        }
        compteur++;
        Animal lanimal = new Animal(type, compteur);

        return lanimal;
    }

}
