package com.company;

import org.fusesource.jansi.Ansi;

public class Fast  extends Car{

    /**
     * Default constructor
     */
    public Fast(Ansi.Color p_Color) {
        super(p_Color);
        m_fSpeed = 35;


    }

    public void Happening() {
        System.out.println("Je suis la voiture rapide");
    }

    @Override
    public void Drive() {
        System.out.println("Je conduit super rapidement");
    }
}
