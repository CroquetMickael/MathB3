package com.company.Gestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionContrainte {
    Scanner scanCommandeline = new Scanner(System.in);

    public List<List> ListOfContrainte(int nbcontrainte, int nbvariable) {
        List<List> listOfContrainte = new ArrayList<>();
        int i = 0;
        int ivar = 0;
        int var = 0;
        while (i < nbcontrainte) {
            List<Integer> listOfCoefficient = new ArrayList<>();
            ivar=0;
            while(ivar < nbvariable)
            {
                System.out.println("Entrer le coefficient : " + ivar);
                var = scanCommandeline.nextInt();
                listOfCoefficient.add(var);
                ivar++;
            }
            System.out.println("Entrer le resultat du coef");
            var = scanCommandeline.nextInt();
            listOfCoefficient.add(var);
            listOfContrainte.add(listOfCoefficient);
            i++;
        }
        return listOfContrainte;
    }

}
