package com.company;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        int choice = menu.carChoice();
        Ansi.Color color = menu.colorChoice();

        Circuit circuit = new Circuit();
        switch (choice) {
            case 1:
                circuit.addCar(new Fast(color));
                break;
            case 2:
                circuit.addCar(new Slow(color));
                break;
        }
        //Lancement de la course
        circuit.areaCar();
    }

}
