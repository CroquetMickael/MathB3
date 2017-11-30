package com.company;

import com.company.Gestion.GestionContrainte;
import com.company.Gestion.GestionVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public  static void main(String[] args) {
        // intialisation du code
        int i = 0;
        List<Integer> listOfVariable = new ArrayList<>();
        List<List> listOfContrainte = new ArrayList<>();
        GestionVariable vargest = new GestionVariable();
        GestionContrainte contgest = new GestionContrainte();
        Scanner scanCommandScanner = new Scanner(System.in);

        // Entrée le nombre de variable
        System.out.println("Veuillez entrée le nombre de variable: ");
        int nbVariable = scanCommandScanner.nextInt();

        // Mise en mémoire des variables
        listOfVariable = vargest.ListofVariable(nbVariable);

        // Récupération de la variable entrante (La plus grande)
        int ve = vargest.MaxVariable(listOfVariable);
        int indexOfVe = listOfVariable.indexOf(ve);
        System.out.println(indexOfVe);
        System.out.println(ve);

        // Entrée le nombre de contrainte
        System.out.println("Veuillez entrée le nombre de contrainte: ");
        int nbContrainte = scanCommandScanner.nextInt();
        listOfContrainte = contgest.ListOfContrainte(nbContrainte, nbVariable);
        System.out.println(listOfContrainte);

    }
}
