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

        // Entr�e le nombre de variable
        System.out.println("Veuillez entr�e le nombre de variable: ");
        int nbVariable = scanCommandScanner.nextInt();

        // Mise en m�moire des variables
        listOfVariable = vargest.ListofVariable(nbVariable);

        // R�cup�ration de la variable entrante (La plus grande)
        int ve = vargest.MaxVariable(listOfVariable);
        int indexOfVe = listOfVariable.indexOf(ve);
        System.out.println(indexOfVe);
        System.out.println(ve);

        // Entr�e le nombre de contrainte
        System.out.println("Veuillez entr�e le nombre de contrainte: ");
        int nbContrainte = scanCommandScanner.nextInt();
        listOfContrainte = contgest.ListOfContrainte(nbContrainte, nbVariable);
        System.out.println(listOfContrainte);

    }
}
