package com.company;

import java.util.*;

/**
 * 
 */
public class Chrono {

    private int seconds = 0;

    Timer timer, lpm = new Timer();
    TimerTask seconds_timer = new TimerTask() {
        @Override
        public void run() {
            System.out.print('\r');
            System.out.print("Vroom, time elapsed : " + seconds++);
        }
    };

    TimerTask ask = new TimerTask() {
        @Override
        public void run() {
            chrono();
            System.out.println("Veuillez taper un nombre");
        }
    };

    /**
     * Default constructor
     */
    public Chrono() {

    }


    /**
     * 
     */
    public void chrono() {
        lpm.scheduleAtFixedRate(seconds_timer, 1000, 1000);
    }

    public void ask() {
        timer.scheduleAtFixedRate(ask, 1000, 1000);
    }

}