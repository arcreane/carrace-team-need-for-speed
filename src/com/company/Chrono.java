package com.company;

import java.util.*;

/**
 *
 */
public class Chrono {

    private int seconds = 0;
    private int speed = 0;

    Timer timer = new Timer();

    TimerTask seconds_timer = new TimerTask() {
        @Override
        public void run() {
            System.out.print('\r');
            System.out.print("Vroom, time elapsed : " + seconds++ + "secs");
        }
    };

    TimerTask speed_timer = new TimerTask() {
        @Override
        public void run() {
            char escCode = 0x1B;
            int row = 10; int column = 10;
            int more = speed += 2;
            System.out.print(String.format("%c[%d;%df",escCode,row,column));
            System.out.print('\r');
            System.out.print("Vroom, time elapsed : " + seconds++ + " secs");
            System.out.print("      ");
            System.out.print("Speed : " + more);
        }
    };


    /**
     * Default constructor
     */
    public Chrono() {

    }

    public void chrono() {
        timer.scheduleAtFixedRate(seconds_timer, 1000, 1000);
    }


    public float speed_timer() {
        timer.scheduleAtFixedRate(speed_timer, 1000, 1000);
        return 0;
    }


}