package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 *
 */
public class Circuit {

    private float seconds = 0f;
    private float traveled_Distance = 831.0f;
    private int lap = 0;
    private float speed = 20.50f;

    /**
     * Default constructor
     */
    public Circuit() {
        areaCar();
    }

    /**
     *
     */
    public void areaCar() {
        //Menu menu = new Menu();

        //Slow slow = new Slow();
        //Fast fast = new Fast();

        System.out.println("Vroom, time elapsed : " + seconds + " secs");
        System.out.println("Distance traveled : " + traveled_Distance + "(Laps number : " + lap + ")");
        System.out.println("Speed : " + speed);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        // Si la voiture est lente alors afficher Slow.Happening() sur un random de 0 à 100 si inférieur à 25 (Récup de l'index choisi par l'utilisateur)
        //if (menu.carChoice().equals("1")) {
        // On affiche l'évenement Vitesse avec un random dans Slow
        //  slow.Happening();
        // Si la voiture est rapide afficher ses 2 évenemnts avec un random de 0 à 100 si inférieur à 35 (Récup de l'index choisi par l'utilisateur)
        //} else if (menu.carChoice().equals("2")) {
        // On afficher l'évenement Roue et Moteur avec un random dans Fast
        //   fast.Happening();
        // } else {
        //    menu.carChoice();
        //}
    }

    /**
     *
     */
    public void Cycle() {
        // TODO implement here
    }

    /**
     *
     */
    public void Car() {
        // TODO implement here
    }

}