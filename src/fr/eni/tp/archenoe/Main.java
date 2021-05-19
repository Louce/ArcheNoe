package fr.eni.tp.archenoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialiser Scanner pour récupérer les données entrées par l'utilisateur
        Scanner scan = new Scanner(System.in);
        //variables pour récupérer le nom, le sexe et l'espère
        String nom = "";
        int sexe = 0;
        int espece = 0;

        //variable pour stocker les données de l'animal
        Animal nouvelAnimal = null;
        //tableaux pour lire les valeurs des classes énumération
        Sexe[] tabSexe = Sexe.values();
        Espece[] tabEspece = Espece.values();

        System.out.println("Quel est ton nom ?");
        nom = scan.nextLine();
        System.out.println("Quel est ton sexe ? 0-MASCULIN  1-FEMININ");
        sexe = scan.nextInt();
        scan.nextLine();
        System.out.println("Quel est ton espèce ? 0-CHAT, 1-CHIEN, 2-GORILLE, 3-LAPIN");
        espece = scan.nextInt();
        scan.nextLine();
        System.out.println("L'animal "+nom+" est dans l'arche.");
        System.out.println("Ajouter un autre animal ? o/N ");
        scan.nextLine();
        //utiliser la méthode ajouter(Animal animal)
        //boucle pour recommencer si oui

    }
}
