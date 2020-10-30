package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

/**
 *
 */
public class Motor extends Mecanic {

    private int[] NombreGenererAlea;

    /**
     * Default constructor
     */
    public Motor() {
    }

    @Override
    public void Fail() {
        repairMotor();
    }

    private int random(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    /**
     *
     */
    public void repairMotor() {
        // Afficher 5 chiffres Aléatoire de 0 à 9 et vérifier qu'il recopie bien correctement la suite si faux,
        // il recommence jusqu'à ce qu'il la raison pour pouvoir réparer son moteur

        System.out.println("Une fumée sort de votre moteur, vous devez le réparer en réecrivant correctement la suite" +
                " de 5 chiffres qui va apparaître");

        int min = 10000;
        int max = 99999;
        int result = random(min, max);

        System.out.println("La suite de 5 chiffres : " + result);

        Scanner Scanner = new Scanner(System.in);

        String NombreAlea = Scanner.nextLine();

        if (NombreAlea.equals(result)) {
            System.out.println("Votre moteur est réparée vous pouvez repartir");
        } else {
            System.out.println("Ce n'est pas la bonne suite réessaye encore " + result);
            NombreAlea = Scanner.nextLine();
        }
    }


}