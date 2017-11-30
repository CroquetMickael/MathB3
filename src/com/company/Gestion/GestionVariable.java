package com.company.Gestion;

import java.util.*;

public class GestionVariable {

        Scanner scanCommandeline = new Scanner(System.in);
    public List<Integer> ListofVariable(int nb)
    {
        List<Integer> listOfVariable = new ArrayList<>();
        int i = 0;
        int var = 0;
        while(i < nb)
        {
            System.out.println("Entrer votre variable : ");
           var =  scanCommandeline.nextInt();
           listOfVariable.add(var);
           i++;
        }
        return listOfVariable;
    }

    public int MaxVariable(List<Integer> list)
    {
        Integer i = Collections.max(list);
        return i;
    }
}
