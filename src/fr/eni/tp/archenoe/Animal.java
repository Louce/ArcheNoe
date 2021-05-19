package fr.eni.tp.archenoe;

public abstract class Animal {
    protected Sexe sexe;
    protected String nom;

    public Animal(Sexe sexe, String nom) {
        this.sexe = sexe;
        this.nom = nom;
    }
}
