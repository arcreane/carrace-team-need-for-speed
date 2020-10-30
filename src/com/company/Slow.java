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
    public Slow(Ansi.Color p_Color) {
        super(p_Color);
        m_fSpeed = 13;

    }

    public String shuffle(String s)
    {

        String shuffledString = "";

        while (s.length() != 0)
        {
            int index = (int) Math.floor(Math.random() * s.length());
            char c = s.charAt(index);
            s = s.substring(0,index)+s.substring(index+1);
            shuffledString += c;
        }

        return shuffledString;

    }

    @Override
    public void Happening() {

        String MotsVitesse = "VITESSE";
        MotsVitesse = shuffle(MotsVitesse);

        System.out.println(ansi().fg(Ansi.Color.MAGENTA).a("Type " + MotsVitesse + " in less than 10 second to get a speed boost Hit enter to start typing"));

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

    @Override
    public void Drive() {
        System.out.println("Je conduit tres lenteeeeeeemmmmmneeennt");
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