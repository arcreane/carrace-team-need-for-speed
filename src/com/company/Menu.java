package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 *
 */
public class Menu {

    int choice;

    /**
     * Default constructor
     */
    public Menu() {

    }


    /**
     *
     */
    public int carChoice() {
        // TODO implement here
        // Message de Bienvenue
        System.out.println("********************************************************");
        System.out.println("*                                                      *");
        System.out.println("*            Welcome to Race against the clock         *");
        System.out.println("*                                                      *");
        System.out.println("********************************************************");
        // Selectionne la voiture que tu veux
        System.out.println("\nPlease select the kind of car you want");
        // Message de Choix
        System.out.println("\t-Type 1 for a speeding car but having 30% chance of failing components");
        System.out.println("\t-Type 2 for a slow car but having 50% chance of having a speeding boost");
        Scanner Scanner = new Scanner(System.in);
        // Récupère les données entrées dans le Scanner
        String CarChoice = Scanner.nextLine();

        choice = 0;
        while (!(choice == 1 || choice == 2)) {
            try {
                choice = Integer.parseInt(CarChoice);
            } catch (NumberFormatException e) {
                System.out.println("Your number is not valid, please try again");
                CarChoice = Scanner.nextLine();
            }
            if (choice != 1 && choice != 2) {
                System.out.println("Your number is not valid, please try again");
                CarChoice = Scanner.nextLine();
            }
        }

        System.out.println("Vous avez choisi la voiture " + choice);


        return choice;

    }

    /**
     *
     */
    public Ansi.Color colorChoice() {

        System.out.println("Choose your Color for your Car, or i'll beat you down mother facka : ");

        System.out.println(ansi().reset().fg(Ansi.Color.BLACK).a("BLACK"));
        System.out.println(ansi().reset().fg(Ansi.Color.RED).a("RED"));
        System.out.println(ansi().reset().fg(Ansi.Color.GREEN).a("GREEN"));
        System.out.println(ansi().reset().fg(Ansi.Color.YELLOW).a("YELLOW"));
        System.out.println(ansi().reset().fg(Ansi.Color.BLUE).a("BLUE"));
        System.out.println(ansi().reset().fg(Ansi.Color.MAGENTA).a("MAGENTA"));
        System.out.println(ansi().reset().fg(Ansi.Color.CYAN).a("CYAN"));
        System.out.println(ansi().reset().fg(Ansi.Color.WHITE).a("WHITE"));


        System.out.println("Type the name of the color you chose : ");
        Scanner Scann = new Scanner(System.in);
        // On récupére la valeur entrée par l'utilisateur
        String color = Scann.nextLine();
        Ansi.Color ansiColor = null;

        while (ansiColor == null) {
            try {
                ansiColor = Ansi.Color.valueOf(color);
            } catch (IllegalArgumentException e) {
                System.out.println("You chose a color invalid");
                color = Scann.nextLine();
            }
        }

        System.out.println(ansi().reset().fg(ansiColor).a("You chose a color " + color));

        return ansiColor;
    }

    /**
     *
     */
    public void Leave() {
        // TODO implement here
        System.out.println("Type 3 for quit the game");
        System.exit(200);
    }

}