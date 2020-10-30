package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 *
 */
public class Circuit {

    Car m_car;
    private float seconds = 0f;
    private float traveled_Distance = 831.0f;
    private int lap = 0;

    /**
     * Default constructor
     */
    public Circuit() {

    }

    /**
     *
     */
    public void areaCar() {


        System.out.println("Vroom, time elapsed : " + seconds + " secs");
        System.out.println("Distance traveled : " + traveled_Distance + "(Laps number : " + lap + ")");
        System.out.println("Speed : " + m_car.getSpeed());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        m_car.Happening();
        m_car.Drive();

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

    public void addCar(Car p_RacingCar) {
        m_car = p_RacingCar;
    }

    /**
     *
     */
    public void Cycle() {
        // TODO implement here
    }
}