package com.company;

import java.util.*;

/**
 *
 */
public class Circuit {

    Car m_car;
    //Chrono chrono = new Chrono();
    private float seconds = 0.0f; //chrono.speed_timer();
    private float traveled_Distance = 831.0f;
    private int lap = 5;

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