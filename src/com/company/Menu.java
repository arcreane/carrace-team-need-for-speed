package com.company;

import org.fusesource.jansi.Ansi;

import java.util.*;

import static org.fusesource.jansi.Ansi.ansi;

/**
 *
 */
public class Menu extends Game {

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

        try {
            choice = Integer.parseInt(CarChoice);
        } catch (NumberFormatException e) {
            System.out.println("Your number is not valid");
            carChoice();
        }

        while(CarChoice.equals("1") || CarChoice.equals("2")) {
            System.out.println("Vous avez choisi la voiture " + choice );
            colorChoice();
        }


        // Si l'utilisateur à taper 1
        /*if (CarChoice.equals("1")) {
            // On le renvoie sur le choix de la couleur
            colorChoice();
            choice = 1;
        } else if (CarChoice.equals("2")) {
            // On le renvoie sur le choix de la couleur
            colorChoice();
            choice = 2;
        } else {
            // Sinon on le renvoie sur le renvoie sur le choix des voitures
            System.out.println("Your number is not valid");
            carChoice();
        }*/
        return choice;
    }

    /**
     *
     */
    public Ansi.Color colorChoice() {
        Circuit p_Circuit = new Circuit();

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

        Ansi.Color AnsiColor = null;

        while (AnsiColor == null) {

            try {

                AnsiColor = Ansi.Color.valueOf(color);

            } catch (IllegalArgumentException e) {
                /*
                 * Si il entre aucune valeur alors on lui indique que son choix est invalide et on le renvoie sur le panel de choix de couleur
                 */
                System.out.println("You chose a color invalid");
                color = Scann.nextLine();
            }
        }

        System.out.println(ansi().reset().fg(AnsiColor).a("You chose a color" + color));
        p_Circuit.areaCar();

        return AnsiColor;

    }

    /**
     *
     */
    public void Leave() {
        // TODO implement here
        System.out.println("Press E for quit the game");
        System.exit(200);
    }

}