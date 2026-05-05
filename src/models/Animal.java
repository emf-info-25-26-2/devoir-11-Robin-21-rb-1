package models;

import java.text.DecimalFormat;

public class Animal {
    private Proprietaire proprietaire;
    private Type type;
    private int num;
    private boolean estHerbivore;
    private boolean estMis;

    public Animal(Type type, int num) {
        this.proprietaire = null;
        this.num = num;
        this.type = type;
        if (type == Type.Cheval || type == Type.Vache || type == Type.Chèvre) {
            this.estHerbivore = true;
        } else {
            this.estHerbivore = false;
        }
        this.estMis = false;
    }

    @Override
    public String toString() {
        DecimalFormat test = new DecimalFormat("0000");
        String aRetourne = "N°" + test.format(num) + "-";
        if (type == Type.Cheval) {
            aRetourne += "Cheval";
        } else if (type == Type.Chien) {
            aRetourne += "Chien";
        } else if (type == Type.Chèvre) {
            aRetourne += "Chèvre";
        } else if (type == Type.Porc) {
            aRetourne += "Porc";
        } else if (type == Type.Poule) {
            aRetourne += "Poule";
        } else if (type == Type.Vache) {
            aRetourne += "Vache";
        }
        aRetourne += "-Propriété de " + proprietaire;
        return aRetourne;
    }

    public Type getType() {
        return type;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public int getNum() {
        return num;
    }

    public boolean getestHerbivore() {
        return estHerbivore;
    }

    public boolean getEstMis() {
        return estMis;
    }

    public void setEstMis(boolean estMis) {
        this.estMis = estMis;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }
}
