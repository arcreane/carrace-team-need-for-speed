package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;
/**
 *
 */
public class Slow extends Car {

    /**
     * Default constructor
     */
    public Slow(Ansi.Color p_Color) {
        super(p_Color);
        m_fSpeed = 13;

    }

    public String shuffle(String s) {

        String shuffledString = "";

        while (s.length() != 0) {
            int index = (int) Math.floor(Math.random() * s.length());
            char c = s.charAt(index);
            s = s.substring(0, index) + s.substring(index + 1);
            shuffledString += c;
        }

        return shuffledString;

    }

    @Override
    public void Happening() {
        // Si la voiture est lente alors afficher Slow.Happening() sur un random de 0 à 100 si inférieur à 25 (Récup de l'index choisi par l'utilisateur)

        String MotsVitesse = "VITESSE";
        MotsVitesse = shuffle(MotsVitesse);

        System.out.println("Type " + MotsVitesse + " in less than 10 second to get a speed boost Hit enter to start typing");

        Scanner Scann = new Scanner(System.in);

        String Vitesse = Scann.nextLine();

        if (Vitesse.equals(MotsVitesse)) {
            System.out.println("Bravo");
            // La course reprend
            // Gagne un boost
        } else {
            System.out.println("Vous n'avez pas la bonne réponse");
            // Pas de boost
            // La course continue
        }
    }

    public void Drive() {
        System.out.println("Je conduit tres lenteeeeeeemmmmmneeennt");
    }

    /**
     *
     */
    public void Timer() {
        // TODO implement here
    }
}