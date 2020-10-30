package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 *
 */
public class Slow extends Car {

    /**
     * Default constructor
     */
    public Slow() {


    }

    @Override
    public void Happening() {
        System.out.println(ansi().fg(Ansi.Color.MAGENTA).a("Type EESTIVIS in less than 10 second to get a speed boost Hit enter to start typing"));

        Scanner Scann = new Scanner(System.in);

        String Vitesse = Scann.nextLine();

        if (Vitesse.equals("EESTIVIS")) {
            System.out.println("Bravo");
            // La course reprend
        } else {
            System.out.println("Vous n'avez pas la bonne réponse");
        }
    }

    /**
     *
     */
    public void boost() {
        // TODO implement here
    }

    /**
     *
     */
    public void Timer() {
        // TODO implement here
    }

}