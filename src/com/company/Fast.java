package com.company;

import org.fusesource.jansi.Ansi;

public class Fast extends Car {

    Mecanic[] mecanics;

    /**
     * Default constructor
     */
    public Fast(Ansi.Color p_Color) {
        super(p_Color);
        m_fSpeed = 35;
        mecanics = new Mecanic[2];
        mecanics[0] = new Motor();
        mecanics[1] = new Roue();
    }

    public void Happening() {
        int max = mecanics.length;
        int nombreRandom = (int) (Math.random() * (max));
        System.out.println(nombreRandom);
        mecanics[nombreRandom].Fail();
        System.out.println("Je suis la voiture rapide");
    }

    @Override
    public void Drive() {
        System.out.println("Je conduit super rapidement");
    }
}
