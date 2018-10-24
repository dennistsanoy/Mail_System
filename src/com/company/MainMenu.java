package com.company;
import java.util.Scanner;

public class MainMenu {
    //color coding
    public static final String ANSI_RESET = "\u001B[0m"; //RESET COLORS
    public static final String C_BLACK = "\033[0;30m";   // BLACK
    public static final String C_RED = "\033[0;31m";     // RED
    public static final String C_GREEN = "\033[0;32m";   // GREEN
    public static final String C_YELLOW = "\033[0;33m";  // YELLOW
    public static final String C_BLUE = "\033[0;34m";    // BLUE
    public static final String C_PURPLE = "\033[0;35m";  // PURPLE
    public static final String C_CYAN = "\033[0;36m";    // CYAN
    public static final String C_WHITE = "\033[0;37m";   // WHITE

    //constants
    private static final String mM0 = C_RED + "Quit" + ANSI_RESET;
    private static final String mM1 = C_PURPLE + "Search Mail" + ANSI_RESET;
    private static final String mM2 = C_GREEN + "Input Mail" + ANSI_RESET;
    private static final String mM3 = C_BLUE + "Edit Mail" + ANSI_RESET;
    private static final String mM4 = C_YELLOW + "Remove Mail" + ANSI_RESET;

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat do you want to do with the Mail System?\n");

        printMenu();

        int choice = input.nextInt();
        choice = validMenuInput(choice);

        System.out.println();

        switchOperation(choice);
        }

    public static void printMenu(){
        System.out.println("0 - " + mM0);
        System.out.println("1 - " + mM1);
        System.out.println("2 - " + mM2);
        System.out.println("3 - " + mM3);
        System.out.println("4 - " + mM4 + "\n");
        System.out.print("Option: ");
    }

    public static int validMenuInput(int option){
        Scanner input = new Scanner(System.in);

        while ((option != 0) && (option != 1) && (option != 2) && (option != 3) && (option != 4)) {
            System.out.print("\nInvalid option. Please select an option between (0-5): ");
            option = input.nextInt();
        }

        return option;
    }

    public static void switchOperation(int option){
        switch(option){
            case 0:
                System.out.println("You have chosen to " + mM0 + "\n");
                System.out.println("Thank you for using the Mail System!");
                break;

            case 1:

                System.out.println("You have chosen to " + mM1);
                break;

            case 2:

                System.out.println("You have chosen to " + mM2);
                break;

            case 3:

                System.out.println("You have chosen to " + mM3);
                break;

            case 4:

                System.out.println("You have chosen to " + mM4);
                break;
        }
    }
}
