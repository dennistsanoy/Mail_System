package com.company;
import java.util.Scanner;

public class MainMenu {
    //color coding
    private static final String ANSI_RESET = "\u001B[0m"; //RESET COLORS
    private static final String C_BLACK = "\033[0;30m";   // BLACK
    private static final String C_RED = "\033[0;31m";     // RED
    private static final String C_GREEN = "\033[0;32m";   // GREEN
    private static final String C_YELLOW = "\033[0;33m";  // YELLOW
    private static final String C_BLUE = "\033[0;34m";    // BLUE
    private static final String C_PURPLE = "\033[0;35m";  // PURPLE
    private static final String C_CYAN = "\033[0;36m";    // CYAN
    private static final String C_WHITE = "\033[0;37m";   // WHITE

    //constants
    public static final String opt0 = C_RED + "Quit" + ANSI_RESET;
    public static final String opt1 = C_PURPLE + "Search Mail" + ANSI_RESET;
    public static final String opt2 = C_GREEN + "Input Mail" + ANSI_RESET;
    public static final String opt3 = C_BLUE + "Display All Mail" + ANSI_RESET;

    public static int main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat do you want to do with the Mail System?\n");

        printMenu();

        int choice = input.nextInt();
        choice = validMenuInput(choice);

        System.out.println();

        switchOperation(choice);
        return choice;
    }

    public static void printMenu() {
        System.out.println("0 - " + opt0);
        System.out.println("1 - " + opt1);
        System.out.println("2 - " + opt2);
        System.out.println("3 - " + opt3 + "\n");
        System.out.print("Option: ");
    }

    public static int validMenuInput(int option) {
        Scanner input = new Scanner(System.in);

        while ((option != 0) && (option != 1) && (option != 2) && (option != 3)) {
            System.out.print("\nInvalid option. Please select an option between (0-5): ");
            option = input.nextInt();
        }

        return option;
    }

    public static void switchOperation(int option) {
        switch (option) {
            case 0:
                System.out.println("You have chosen to " + opt0 + "\n");
                System.out.println("Thank you for using the Mail System!");
                break;

            case 1:

                System.out.println("You have chosen to " + opt1);
                break;

            case 2:

                System.out.println("You have chosen to " + opt2  + "\n");
                break;

            case 3:

                System.out.println("You have chosen to " + opt3 + "\n");
                break;

        }
    }
}
