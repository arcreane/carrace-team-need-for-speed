package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

/**
 * 
 */

public abstract class Car {
    Ansi.Color m_CarColor;
    float m_fSpeed;

    /**
     * Default constructor
     */
    public Car(Ansi.Color p_Color) {
        m_CarColor = p_Color;
    }

    /**
     * 
     */
    public float getSpeed(){
        return m_fSpeed;
    }

    /**
     * 
     */
    public void Happening() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Drive() {
        // TODO implement here
    }

}